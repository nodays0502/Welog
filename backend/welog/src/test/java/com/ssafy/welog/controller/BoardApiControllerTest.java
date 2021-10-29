package com.ssafy.welog.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.welog.api.controller.AdminApiController;
import com.ssafy.welog.api.controller.BoardApiController;
import com.ssafy.welog.api.controller.dto.BoardDto.*;
import com.ssafy.welog.domain.users.common.AuthLevel;
import com.ssafy.welog.service.AdminService;
import com.ssafy.welog.service.BoardService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.ssafy.welog.ApiDocumentUtils.getDocumentRequest;
import static com.ssafy.welog.ApiDocumentUtils.getDocumentResponse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.restdocs.snippet.Attributes.key;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.SharedHttpSessionConfigurer.sharedHttpSession;


@ExtendWith(RestDocumentationExtension.class) // JUnit 5 사용시 문서 스니펫 생성용
@WebMvcTest(controllers = BoardApiController.class) //@WebMvcTest:컨트롤러만 테스트하기위한 특수 어노테이션
class BoardApiControllerTest {

    @Autowired
    private MockMvc mockMvc;//mock객체 만드는애

    @Autowired
    ObjectMapper objectMapper;//직렬화 역직렬화 하는애

    @MockBean // mockbean이 다른애(같은레벨)한테 의존성을 가지고있으면 에러남, mock은 순수 목객체/ mockbean은 슬라이스테스트
    BoardService boardService;

    @BeforeEach//mock객체 관련 환경설정
    public void setup(WebApplicationContext webApplicationContext,
        RestDocumentationContextProvider restDocumentation) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
            .apply(documentationConfiguration(restDocumentation))
            .apply(sharedHttpSession())
            .addFilters(new CharacterEncodingFilter("UTF-8", true))
            .build();
    }

    @Test
    @DisplayName("게시글 삭제 - 성공")//테스트 돌릴때 뜨는 이름 
    public void deleteBoard_success() throws Exception {
        //given
        Long boardID = 1L;

        //when
        doNothing().when(boardService).deleteBoard(boardID);

        //then
        mockMvc.perform(delete("/api/board/{boardID}", boardID)
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk()) // 200 isOk
                .andDo(
                        document( //spring rest docs를 만들기 위함
                                "boardApi/deleteBoardInfo/successful",
                                getDocumentRequest(),
                                getDocumentResponse(),
                                pathParameters(
                                        parameterWithName("boardID").description("삭제시킬 게시판의 아이디")
                                )
                        ));
    }

    @Test
    @DisplayName("게시글 변경 - 성공")
    public void changeBoard_success() throws Exception {
        //given
        ChangeBoardReqDto changeBoardReqDto = ChangeBoardReqDto.builder()
                .boardId(1L)
                .content("예시 내용도 채우기이")
                .registerTime(LocalDateTime.now())
                .build();
        //when
        doNothing().when(boardService).changeBoard(changeBoardReqDto);

        //then
        mockMvc.perform(put("/api/board")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(changeBoardReqDto)))
            .andDo(print())
            .andExpect(status().isOk()); // 200 isOk();
    }


    @Test
    @DisplayName("게시글 전체 조회 - 성공")
    public void searchAllBoard_success() throws Exception {
        //given
        PageDto pageDto = PageDto.builder()
                .page(1)
                .build();

        SearchBoardDto searchBoardDto = SearchBoardDto.builder()
                .boardId(1L)
                .content("")
                .registerTime(LocalDateTime.now())
                .build();

        List<SearchBoardDto> boardList = new ArrayList<>();
        boardList.add(searchBoardDto);
        SearchBoardResDto searchBoardResDto = SearchBoardResDto.builder()
                .boardList(boardList)
                .build();
        //when
        doReturn(searchBoardResDto).when(boardService).searchAllBoard(pageDto);

        //then
        mockMvc.perform(get("/api/board")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("게시글 조회 - 성공")
    public void searchBoard_success() throws Exception {
        //given
        Long boardID = 1L;
        SearchBoardDto searchBoardDto = SearchBoardDto.builder()
                .boardId(1L)
                .content("")
                .registerTime(LocalDateTime.now())
                .build();
        //when
        doReturn(searchBoardDto).when(boardService).searchBoard(boardID);

        //then
        mockMvc.perform(get("/api/board/{boardID}", boardID)
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("게시글 등록 - 성공")
    public void addBoard_success() throws Exception {
        //given
        Long boardID = 1L;
        AddBoardReqDto addBoardReqDto = AddBoardReqDto.builder()
                .boardId(1L)
                .content("")
                .title("")
                .version("")
                .category("")
                .build();
        //when
        doNothing().when(boardService).addBoard(addBoardReqDto);

        //then
        mockMvc.perform(post("/api/board")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

}