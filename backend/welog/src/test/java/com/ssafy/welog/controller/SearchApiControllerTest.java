package com.ssafy.welog.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.welog.api.controller.SearchApiController;
import com.ssafy.welog.api.controller.dto.BoardDto;
import com.ssafy.welog.api.controller.dto.SearchDto;
import com.ssafy.welog.domain.entity.Board;
import com.ssafy.welog.service.SearchService;
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
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.ssafy.welog.ApiDocumentUtils.getDocumentRequest;
import static com.ssafy.welog.ApiDocumentUtils.getDocumentResponse;
import static com.ssafy.welog.api.controller.dto.BoardDto.*;
import static com.ssafy.welog.api.controller.dto.SearchDto.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.SharedHttpSessionConfigurer.sharedHttpSession;

@ExtendWith(RestDocumentationExtension.class)
@WebMvcTest(controllers = SearchApiController.class)
public class SearchApiControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;
    @MockBean
    SearchService searchService;

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
    @DisplayName("?????? - ??????")
    public void search_success() throws Exception{
        //given
        SearchReqDto searchReqDto = SearchReqDto.builder()
                .page(1)
                .searchType("??????")
                .searchWord("??????")
                .build();
        List<Board> data = searchService.search(searchReqDto);
        SearchResDto searchResDto = SearchResDto.builder().data(Collections.singletonList(data)).build();

        //when
        doReturn(searchResDto).when(searchService).search(searchReqDto);

        //then
        mockMvc.perform(
                    get("/api/search")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(searchReqDto)))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(
                    document(
                            "searchApi/search/successful",
                            getDocumentRequest(),
                            getDocumentResponse(),
                            pathParameters(
                                parameterWithName("searchType").description("????????? ??????"),
                                parameterWithName("searchWord").description("????????? ?????????")
                            ),
                            requestFields(
                                fieldWithPath("boardList[].boardId").type(JsonFieldType.NUMBER)
                                    .description("Board DB PK ???"),
                                fieldWithPath("boardList[].content").type(JsonFieldType.STRING)
                                    .description("Board ??????"),
                                fieldWithPath("boardList[].registerTime").type(JsonFieldType.STRING)
                                    .description("Board ?????? ??????")
                            )
                    )
                );
    }
    @Test
    @DisplayName("????????? ?????? - ??????")
    public void recommend_search_success() throws Exception {
        //given
        SearchReqDto searchReqDto = SearchReqDto.builder()
                .page(1)
                .searchWord("??????")
                .build();
        List<Object> data = new ArrayList<>();
        data.add("?????????");
        data.add("????????? ??????");
        data.add("????????? ?????? ??????");
        SearchResDto searchResDto = SearchResDto.builder().data(data).build();

        //when
        doReturn(searchResDto).when(searchService).search(searchReqDto);

        //then
        mockMvc.perform(
                get("/api/search/recommend")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(searchReqDto)))
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(
                        document(
                                "searchApi/searchRecommend/successful",
                                getDocumentRequest(),
                                getDocumentResponse(),
                                pathParameters(
                                        parameterWithName("searchWord").description("?????? ?????? ?????????")
                                ),
                                requestFields(
                                        fieldWithPath("searchList[].recommendWord").type(JsonFieldType.STRING)
                                                .description("?????? ?????????")
                                )
                        )
                );
    }
}
