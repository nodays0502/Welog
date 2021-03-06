package com.ssafy.welog.controller;

import static com.ssafy.welog.ApiDocumentUtils.getDocumentRequest;
import static com.ssafy.welog.ApiDocumentUtils.getDocumentResponse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.delete;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.restdocs.snippet.Attributes.key;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.SharedHttpSessionConfigurer.sharedHttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.welog.api.controller.AuthApiController;
import com.ssafy.welog.api.controller.dto.AuthDto.LoginReqDto;
//import com.ssafy.welog.api.controller.dto.AuthDto.LoginResDto;
import com.ssafy.welog.service.AuthService;
import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
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


@ExtendWith(RestDocumentationExtension.class) // JUnit 5 ????????? ?????? ????????? ?????????
@WebMvcTest(controllers = AuthApiController.class)
class AuthApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    AuthService authService;

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
    @DisplayName("????????? - ??????")
    public void login_success() throws Exception {
        LoginReqDto loginReqDto = LoginReqDto.builder()
            .userEmail("juhyun7955@naver.com")
            .password("????????????")
            .build();

//        LoginResDto loginResDto = LoginResDto.builder()
//            .sessionId("?????? ?????????")
//            .build();
        HttpSession httpSession = new HttpSession() {
            @Override
            public long getCreationTime() {
                return 0;
            }

            @Override
            public String getId() {
                return null;
            }

            @Override
            public long getLastAccessedTime() {
                return 0;
            }

            @Override
            public ServletContext getServletContext() {
                return null;
            }

            @Override
            public void setMaxInactiveInterval(int interval) {

            }

            @Override
            public int getMaxInactiveInterval() {
                return 0;
            }

            @Override
            public HttpSessionContext getSessionContext() {
                return null;
            }

            @Override
            public Object getAttribute(String name) {
                return null;
            }

            @Override
            public Object getValue(String name) {
                return null;
            }

            @Override
            public Enumeration<String> getAttributeNames() {
                return null;
            }

            @Override
            public String[] getValueNames() {
                return new String[0];
            }

            @Override
            public void setAttribute(String name, Object value) {

            }

            @Override
            public void putValue(String name, Object value) {

            }

            @Override
            public void removeAttribute(String name) {

            }

            @Override
            public void removeValue(String name) {

            }

            @Override
            public void invalidate() {

            }

            @Override
            public boolean isNew() {
                return false;
            }
        };
        doNothing().when(authService).login(loginReqDto , httpSession);

        mockMvc.perform(post("/api/auth")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(loginReqDto)))
            .andDo(print())
            .andExpect(status().isOk()) // 200 isOk
            .andDo(
                document(
                    "authApi/login/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    requestFields(
                        fieldWithPath("userEmail")
                            .type(JsonFieldType.STRING)
                            .description("?????? ??????????????????")
                            .attributes(key("constraint")
                                .value("")),
                        fieldWithPath("password")
                            .type(JsonFieldType.STRING)
                            .description("????????? ?????????????????????.")
                    ),
                    responseFields(
                        fieldWithPath("sessionId")
                            .type(JsonFieldType.STRING)
                            .description("?????? ??????????????????")
                            .attributes(key("constraint")
                                .value("????????? ?????? ????????? ????????????."))
                    )
                ));
    }

//    @Test
//    @DisplayName("???????????? - ??????")
//    public void logout_success() throws Exception {
//        //given
//        String userEmail = "juhyun7955@naver.com";
//        UserInfoDto userInfoDto = UserInfoDto.builder()
//            .email(userEmail)
//            .nickname("??????????????????")
//            .phone("010-0000-0000")
//            .userLevel(AuthLevel.ADMIN)
//            .build();
////        given(.getUser(userEmail)).willReturn(userInfoDto);
//
//        mockMvc.perform(get("/api/user/{userEmail}", userEmail)
//            .contentType(MediaType.APPLICATION_JSON))
//            .andDo(print())
//            .andExpect(status().isOk()) // 200 isOk
//            .andDo(
//                document(
//                    "authApi/logout/successful",
//                    getDocumentRequest(),
//                    getDocumentResponse(),
//                    pathParameters(
//                        parameterWithName("userEmail").description("????????? ?????????")
//                    )
//                ));
//    }
}