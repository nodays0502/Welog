package com.ssafy.welog.controller;

import com.ssafy.welog.api.controller.CommentApiController;
import com.ssafy.welog.api.controller.dto.CommentDto.AddFeelingtReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.ChangeCommentReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.SearchCommentDto;
import com.ssafy.welog.api.controller.dto.CommentDto.SearchCommentResDto;
import com.ssafy.welog.domain.common.Feeling;
import java.util.ArrayList;
import java.util.List;

import static com.ssafy.welog.ApiDocumentUtils.getDocumentRequest;
import static com.ssafy.welog.ApiDocumentUtils.getDocumentResponse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.delete;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.patch;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.put;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.restdocs.request.RequestDocumentation.requestParameters;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.SharedHttpSessionConfigurer.sharedHttpSession;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.welog.api.controller.dto.CommentDto.AddCommentReqDto;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.service.CommentService;
import java.time.LocalDateTime;
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
@WebMvcTest(controllers = CommentApiController.class)
public class CommentApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    CommentService commentService;

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
    @DisplayName("댓글 등록 - 성공")
    public void addComment_success() throws Exception {
        //given
        AddCommentReqDto addCommentReqDto = AddCommentReqDto.builder()
            .content("내용")
            .line(2L)
            .parentId(1L)
            .build();
        User user = User.builder()
                .build();
        //when
        doNothing().when(commentService).addComment(user, addCommentReqDto);

        //then
        mockMvc.perform(post("/api/comment")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(addCommentReqDto)))
            .andDo(print())
            .andExpect(status().isCreated()) // 201 isCreated()
            .andDo(
                document(
                    "commentApi/addComment/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    requestFields(
                        fieldWithPath("content").type(JsonFieldType.STRING)
                            .description("댓글 내용"),
                        fieldWithPath("line").type(JsonFieldType.NUMBER)
                            .description("글의 라인"),
                        fieldWithPath("registerTime").type(JsonFieldType.STRING)
                            .description("댓글 작성 시간"),
                        fieldWithPath("parentId").type(JsonFieldType.NUMBER)
                            .description("상위 댓글 번호")
                    )
                ));
    }

    @Test
    @DisplayName("댓글 조회 - 성공")
    public void searchComment_success() throws Exception {
        //given
        Long boardId = 1L;
        List<SearchCommentDto> commentList = new ArrayList<>();
        commentList.add(SearchCommentDto.builder()
            .commentId(1L)
            .content("댓글1")
            .registerTime(LocalDateTime.now())
            .build());

        commentList.add(SearchCommentDto.builder()
            .commentId(2L)
            .content("댓글2")
            .registerTime(LocalDateTime.now())
            .build());

        SearchCommentResDto searchCommentResDto = SearchCommentResDto.builder()
            .commentList(commentList)
            .build();
        //when
        doReturn(searchCommentResDto).when(commentService).searchComment(any());
        given(commentService.searchComment(boardId)).willReturn(searchCommentResDto);

        //then
        mockMvc.perform(get("/api/comment")
            .contentType(MediaType.APPLICATION_JSON)
            .param("boardId", String.valueOf(boardId))
        )
            .andDo(print())
            .andExpect(status().isOk()) // 200 isOk()
            .andDo(
                document(
                    "commentApi/searchComment/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    requestParameters(
                        parameterWithName("boardId")
                            .description("글 번호")
                    ),
                    responseFields(
                        fieldWithPath("commentList[].commentId").type(JsonFieldType.NUMBER)
                            .description("댓글의 번호"),
                        fieldWithPath("commentList[].content").type(JsonFieldType.STRING)
                            .description("댓글 내용"),
                        fieldWithPath("commentList[].registerTime").type(JsonFieldType.STRING)
                            .description("댓글 작성 시간")
                    )
                ));
    }

    @Test
    @DisplayName("댓글 수정 - 성공")
    public void changeComment_success() throws Exception {
        //given
        ChangeCommentReqDto changeCommentDto = ChangeCommentReqDto.builder()
            .commentId(1L)
            .content("바뀐 내용")
            .build();
        User user = User.builder()
                .build();

        //when
        doNothing().when(commentService).changeComment(user, changeCommentDto);

        //then
        mockMvc.perform(put("/api/comment")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(changeCommentDto)))
            .andDo(print())
            .andExpect(status().isOk()) // 200 isOk()
            .andDo(
                document(
                    "commentApi/changeComment/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    requestFields(
                        fieldWithPath("commentId").type(JsonFieldType.NUMBER)
                            .description("댓글 번호"),
                        fieldWithPath("content").type(JsonFieldType.STRING)
                            .description("바뀐 댓글 내용")
                    )
                ));
    }

    @Test
    @DisplayName("댓글 삭제 - 성공")
    public void deleteComment_success() throws Exception {
        //given
        Long commentId = 1L;

        //when
        doNothing().when(commentService).deleteComment(commentId);

        //then
        mockMvc.perform(delete("/api/comment/{commentId}", commentId)
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(commentId)))
            .andDo(print())
            .andExpect(status().isOk()) // 200 isOk()
            .andDo(
                document(
                    "commentApi/deleteComment/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    pathParameters(
                        parameterWithName("commentId")
                            .description("댓글 번호")
                    )
                ));
    }

    @Test
    @DisplayName("댓글 좋아요 - 성공")
    public void addLike_success() throws Exception {
        //given
        AddFeelingtReqDto addFeelingtDto = AddFeelingtReqDto.builder()
            .commentId(1L)
            .feeling(Feeling.LIKE)
            .build();
        User user = User.builder()
                .build();

        //when
        doNothing().when(commentService).addLike(user, addFeelingtDto);

        //then
        mockMvc.perform(patch("/api/comment")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(addFeelingtDto)))
            .andDo(print())
            .andExpect(status().isOk()) // 200 isOk()
            .andDo(
                document(
                    "commentApi/addLike/successful",
                    getDocumentRequest(),
                    getDocumentResponse(),
                    requestFields(
                        fieldWithPath("commentId").type(JsonFieldType.NUMBER)
                            .description("댓글 번호"),
                        fieldWithPath("feeling").type(JsonFieldType.STRING)
                            .description("좋아요 or 싫어요")
                    )
                ));
    }
}
