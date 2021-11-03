package com.ssafy.welog.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.delete;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.patch;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.restdocs.snippet.Attributes.key;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.SharedHttpSessionConfigurer.sharedHttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.welog.api.controller.AdminApiController;
import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.BoardRollBackResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.ChangeBoardReqDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SeachUserDto;
import com.ssafy.welog.api.controller.dto.AdminDto.SearchAllUserResDto;
import com.ssafy.welog.api.controller.dto.AdminDto.UserChangeReqDto;
import com.ssafy.welog.domain.common.AuthLevel;
import com.ssafy.welog.service.AdminService;

import static com.ssafy.welog.ApiDocumentUtils.*;

import java.util.ArrayList;
import java.util.List;
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


@ExtendWith(RestDocumentationExtension.class) // JUnit 5 사용시 문서 스니펫 생성용
@WebMvcTest(controllers = AdminApiController.class)
class AdminApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    AdminService adminService;

    @BeforeEach
    public void setup(WebApplicationContext webApplicationContext,
        RestDocumentationContextProvider restDocumentation) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
            .apply(documentationConfiguration(restDocumentation))
            .apply(sharedHttpSession())
            .addFilters(new CharacterEncodingFilter("UTF-8", true))
            .build();
    }


    @Test
    @DisplayName("관리자 회원 탈퇴 - 성공")
    public void deleteUser_success() throws Exception {
        //given
        String userEmail = "juhyun7955@naver.com";

        //when
        doNothing().when(adminService).deleteUser(userEmail);

        //then
        mockMvc.perform(delete("/api/admin/user/{userEmail}", userEmail)
            .contentType(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().isOk()) // 200 isOk
            .andDo(
                document(
                    "adminApi/deleteUserInfo/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    pathParameters(
                        parameterWithName("userEmail").description("회원 탈퇴시킬 유저의 이메일")
                    )
                ));
    }

    @Test
    @DisplayName("관리자 회원 정보 변경 - 성공")
    public void changeUser_success() throws Exception {
        //given
        UserChangeReqDto userChangeReqDto = UserChangeReqDto.builder()
            .userId(1L)
            .authLevel(AuthLevel.AUTH)
            .build();
        //when
        doNothing().when(adminService).changeUser(userChangeReqDto);

        //then
        mockMvc.perform(patch("/api/admin/user")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(userChangeReqDto)))
            .andDo(print())
            .andExpect(status().isOk()) // 200 isOk()
            .andDo(
                document(
                    "adminApi/changeUserInfo/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    requestFields(
                        fieldWithPath("userId")
                            .type(JsonFieldType.NUMBER)
                            .description("유저 DB의 PK 값입니다.")
                            .attributes(key("constraint")
                                .value("")),
                        fieldWithPath("authLevel")
                            .type(JsonFieldType.STRING)
                            .description("유저의 권한 값입니다.")
                    )
                ));
    }

    @Test
    @DisplayName("관리자 유저 조회 - 성공")
    public void searchAllUser_success() throws Exception {
        //given
        String userEmail = "juhyun7955@naver.com";
        SeachUserDto seachUserDto = SeachUserDto.builder()
            .userId(1L)
            .userName("김주현")
            .userEmail("juhyun7955@naver.com")
            .authLevel(AuthLevel.ADMIN)
            .build();
        List<SeachUserDto> userList = new ArrayList<>();
        userList.add(seachUserDto);
        SearchAllUserResDto searchAllUserResDto = SearchAllUserResDto.builder()
            .userList(userList)
            .build();
        //when
        doReturn(searchAllUserResDto).when(adminService).searchUser(userEmail);

        //then
        mockMvc.perform(get("/api/admin/user/{userEmail}", userEmail)
            .contentType(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().isOk())
            .andDo(
                document(
                    "adminApi/getUserInfo/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    pathParameters(
                        parameterWithName("userEmail").description("요청할 유저의 이메일")
                    ),
                    responseFields(
                        fieldWithPath("userList[].userId").type(JsonFieldType.NUMBER)
                            .description("User의 DB PK 값"),
                        fieldWithPath("userList[].userName").type(JsonFieldType.STRING)
                            .description("유저 이름"),
                        fieldWithPath("userList[].userEmail").type(JsonFieldType.STRING)
                            .description("유저 이메일"),
                        fieldWithPath("userList[].authLevel").type(JsonFieldType.STRING)
                            .description("유저 권한 값")
                    )
                ));
    }

    @Test
    @DisplayName("관리자 게시글 권한 수정 - 성공")
    public void changeBoard_success() throws Exception {
        //given
        ChangeBoardReqDto changeBoardReqDto = ChangeBoardReqDto.builder()
            .boardId(1L)
            .auth(AuthLevel.ADMIN)
            .build();
        //when
        doNothing().when(adminService).changeBoard(changeBoardReqDto);

        //then
        mockMvc.perform(patch("/api/admin/board")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(changeBoardReqDto)))
            .andDo(print())
            .andExpect(status().isOk()) // 201 isCreated()
            .andDo(
                document(
                    "adminApi/changeBoardAuth/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    requestFields(
                        fieldWithPath("boardId").type(JsonFieldType.NUMBER)
                            .description("글번호"),
                        fieldWithPath("auth").type(JsonFieldType.STRING)
                            .description("변경할 글의 수정 권한")
                    )
                ));
    }

    @Test
    @DisplayName("게시글 버전 롤백 - 성공")
    public void rollBackBoard_success() throws Exception {
        //given
        BoardRollBackReqDto boardRollBackReqDto = BoardRollBackReqDto.builder()
            .boardId(1L)
            .version("1.0")
            .build();
        BoardRollBackResDto boardRollBackResDto = BoardRollBackResDto.builder()
            .content("롤백한 글의 내용")
            .version("1.0")
            .build();
        //when
        doReturn(boardRollBackResDto).when(adminService).rollBackBoard(any());

        //then
        mockMvc.perform(patch("/api/admin/rollbackboard")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(boardRollBackReqDto)))
            .andDo(print())
            .andExpect(status().isOk())
            .andDo(
                document(
                    "adminApi/patchRollBackBoard/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    requestFields(
                        fieldWithPath("boardId").type(JsonFieldType.NUMBER)
                            .description("글 번호(PK)"),
                        fieldWithPath("version").type(JsonFieldType.STRING)
                            .description("글 형상관리 버전")
                    ),
                    responseFields(
                        fieldWithPath("content").type(JsonFieldType.STRING)
                            .description("롤백된 글의 내용"),
                        fieldWithPath("version").type(JsonFieldType.STRING)
                            .description("글 형상관리 버전")
                    )
                ));
    }
}