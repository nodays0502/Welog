package com.ssafy.welog.api.controller;


import com.ssafy.welog.api.controller.dto.CommentDto.AddCommentReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.AddFeelingtReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.ChangeCommentReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.SearchCommentResDto;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.ssafy.welog.common.util.constants.ResponseConstants.CREATED;
import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;

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
    public ResponseEntity<Void> addComment(@AuthenticationPrincipal User user, @Valid @RequestBody AddCommentReqDto addCommentDto) {
        commentService.addComment(user, addCommentDto);
        return CREATED;
    }

    /*
     * 댓글 조회를 구현한 메서드
     */
    @GetMapping
    public ResponseEntity<SearchCommentResDto> searchComment(Long boardId) {
        return ResponseEntity.ok(commentService.searchComment(boardId));
    }

    /*
     * 댓글 수정을 구현한 메서드
     */
    @PutMapping
    public ResponseEntity<Void> changeComment(@AuthenticationPrincipal User user, @Valid @RequestBody ChangeCommentReqDto changeCommentDto) {
        commentService.changeComment(user, changeCommentDto);
        return OK;
    }

    /*
     * 댓글 삭제를 구현한 메서드
     */
    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(@AuthenticationPrincipal User user, @PathVariable Long commentId) {
        commentService.deleteComment(commentId);
        return OK;
    }

    /*
     * 댓글 좋아요/ 싫어요 기능을 구현한 메서드
     */
    @PatchMapping
    public ResponseEntity<Void> addLike(@AuthenticationPrincipal User user, @Valid @RequestBody AddFeelingtReqDto addFeelingtDto) {
        commentService.addLike(user, addFeelingtDto);
        return OK;
    }

}
