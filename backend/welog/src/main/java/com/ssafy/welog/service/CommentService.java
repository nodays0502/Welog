package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.CommentDto.AddCommentReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.AddFeelingtReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.ChangeCommentReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.SearchCommentDto;
import com.ssafy.welog.api.controller.dto.CommentDto.SearchCommentResDto;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CommentService {

    public void addComment(AddCommentReqDto addCommentDto) {
        log.info("댓글 추가");
    }

    public SearchCommentResDto searchComment(Long BoardId) {
        log.info("댓글 조회");
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

        return SearchCommentResDto.builder()
            .commentList(commentList)
            .build();
    }

    public void changeComment(ChangeCommentReqDto changeCommentDto) {
        log.info("댓글 변경");
    }

    public void deleteComment(Long commentId) {
        log.info("댓글 삭제");
    }

    public void addLike(AddFeelingtReqDto addFeelingtDto) {
        log.info("댓글 좋아요 알림 설정까지 따르르르릉");
    }
}
