package com.ssafy.welog.api.controller.dto;

import com.ssafy.welog.domain.entity.Feeling;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

public class CommentDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class AddCommentReqDto {

        @NotBlank
        private String content;
        private Long line;
        private Long ParentId;
        private LocalDateTime registerTime;

        @Builder
        public AddCommentReqDto(String content,  Long line, Long parentId,
            LocalDateTime registerTime) {
            this.content = content;
            this.line = line;
            ParentId = parentId;
            this.registerTime = registerTime;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchCommentResDto {
        private List<SearchCommentDto> commentList;

        @Builder
        public SearchCommentResDto(List<SearchCommentDto> commentList) {
            this.commentList = commentList;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchCommentDto{

        private Long commentId;
        @NotBlank
        private String content;
        private LocalDateTime registerTime;

        @Builder
        public SearchCommentDto(Long commentId, String content, LocalDateTime registerTime) {
            this.commentId = commentId;
            this.content = content;
            this.registerTime = registerTime;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class ChangeCommentReqDto {
        private Long commentId;
        @NotBlank
        private String content;

        @Builder
        public ChangeCommentReqDto(Long commentId, String content, LocalDateTime registerTime) {
            this.commentId = commentId;
            this.content = content;
        }
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class AddFeelingtReqDto {
        private Long commentId;
        private Feeling feeling;

        @Builder
        public AddFeelingtReqDto(Long commentId, Feeling feeling) {
            this.commentId = commentId;
            this.feeling = feeling;
        }
    }
}
