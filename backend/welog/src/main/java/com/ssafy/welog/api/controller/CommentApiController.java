package com.ssafy.welog.api.controller;


import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;

import com.ssafy.welog.api.controller.dto.CommentDto.AddCommentReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.AddFeelingtReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.ChangeCommentReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.SearchCommentResDto;
import com.ssafy.welog.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/comment")
public class CommentApiController {

    private final CommentService commentService;

    public CommentApiController(CommentService commentService) {
        this.commentService = commentService;
    }

    /*
     * 댓글 등록을 구현한 메서드
     */
    @PostMapping
    public ResponseEntity<Void> addComment(AddCommentReqDto addCommentDto) {
        commentService.addComment(addCommentDto);
        return OK;
    }

    /*
     * 댓글 조회를 구현한 메서드
     */
    @GetMapping
    public ResponseEntity<SearchCommentResDto> searchComment(Long BoardId) {
        return ResponseEntity.ok(commentService.searchComment(BoardId));
    }

    /*
     * 댓글 수정을 구현한 메서드
     */
    @PutMapping
    public ResponseEntity<Void> changeComment(ChangeCommentReqDto changeCommentDto) {
        commentService.changeComment(changeCommentDto);
        return OK;
    }

    /*
     * 댓글 삭제를 구현한 메서드
     */
    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId) {
        commentService.deleteComment(commentId);
        return OK;
    }

    /*
     * 댓글 좋아요/ 싫어요 기능을 구현한 메서드
     */
    @PatchMapping
    public ResponseEntity<Void> addLike(AddFeelingtReqDto addFeelingtDto) {
        commentService.addLike(addFeelingtDto);
        return OK;
    }

}
