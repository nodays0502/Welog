package com.ssafy.welog.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.welog.api.controller.BoardApiController;
import com.ssafy.welog.api.controller.dto.BoardDto.*;
import com.ssafy.welog.domain.entity.User;
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
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.SharedHttpSessionConfigurer.sharedHttpSession;


@ExtendWith(RestDocumentationExtension.class) // JUnit 5 ????????? ?????? ????????? ?????????
@WebMvcTest(controllers = BoardApiController.class) //@WebMvcTest:??????????????? ????????????????????? ?????? ???????????????
class BoardApiControllerTest {

    @Autowired
    private MockMvc mockMvc;//mock?????? ????????????

    @Autowired
    ObjectMapper objectMapper;//????????? ???????????? ?????????

    @MockBean // mockbean??? ?????????(????????????)?????? ???????????? ?????????????????? ?????????, mock??? ?????? ?????????/ mockbean??? ?????????????????????
    BoardService boardService;

    @BeforeEach//mock?????? ?????? ????????????
    public void setup(WebApplicationContext webApplicationContext,
        RestDocumentationContextProvider restDocumentation) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
            .apply(documentationConfiguration(restDocumentation))
            .apply(sharedHttpSession())
            .addFilters(new CharacterEncodingFilter("UTF-8", true))
            .build();
    }

    @Test
    @DisplayName("????????? ?????? - ??????")//????????? ????????? ?????? ?????? 
    public void deleteBoard_success() throws Exception {
        //given
        Long boardID = 1L;
        Long userId = 1L;
        User user = User.builder().build();
        //when
        doNothing().when(boardService).deleteBoard(user,boardID);

        //then
        mockMvc.perform(delete("/api/board/{boardID}", boardID)
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk()) // 200 isOk
                .andDo(
                        document( //spring rest docs??? ????????? ??????
                                "boardApi/deleteBoardInfo/successful",
                                getDocumentRequest(),
                                getDocumentResponse(),
                                pathParameters(
                                        parameterWithName("boardID").description("???????????? ???????????? ?????????")
                                )
                        ));
    }

    @Test
    @DisplayName("????????? ?????? - ??????")
    public void changeBoard_success() throws Exception {
        //given
        Long userId = 1L;
        User user = User.builder().build();
        ChangeBoardReqDto changeBoardReqDto = ChangeBoardReqDto.builder()
                .boardId(1L)
                .content("?????? ????????? ????????????")
                .build();
        //when
        doNothing().when(boardService).changeBoard(user,changeBoardReqDto);

        //then
        mockMvc.perform(put("/api/board")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(changeBoardReqDto)))
            .andDo(print())
            .andExpect(status().isOk()); // 200 isOk();
    }


    @Test
    @DisplayName("????????? ?????? ?????? - ??????")
    public void searchAllBoard_success() throws Exception {
        //given
//        PageDto pageDto = PageDto.builder()
//                .page(1)
//                .build();
        int page = 0;
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
        doReturn(searchBoardResDto).when(boardService).searchAllBoard(page);

        //then
        mockMvc.perform(get("/api/board")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("????????? ?????? - ??????")
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
    @DisplayName("????????? ?????? - ??????")
    public void addBoard_success() throws Exception {
        //given
        Long boardID = 1L;
        User user = User.builder()
            .build();
        AddBoardReqDto addBoardReqDto = AddBoardReqDto.builder()
                .content("")
                .title("")
                .version("")
                .category("")
                .build();
        //when
        doNothing().when(boardService).addBoard(user,addBoardReqDto);

        //then
        mockMvc.perform(post("/api/board")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

}