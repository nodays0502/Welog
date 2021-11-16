package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.BoardDto;
import com.ssafy.welog.api.controller.dto.CommentDto;
import com.ssafy.welog.api.controller.dto.CommentDto.AddCommentReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.AddFeelingtReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.ChangeCommentReqDto;
import com.ssafy.welog.api.controller.dto.CommentDto.SearchCommentDto;
import com.ssafy.welog.api.controller.dto.CommentDto.SearchCommentResDto;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.ssafy.welog.domain.common.AuthLevel;
import com.ssafy.welog.domain.entity.Board;
import com.ssafy.welog.domain.entity.Comment;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.domain.entity.UserBoard;
import com.ssafy.welog.domain.repository.BoardRepository;
import com.ssafy.welog.domain.repository.CommentRepository;
import com.ssafy.welog.domain.repository.UserBoardRepository;
import com.ssafy.welog.domain.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CommentService {
    private final BoardRepository boardRepository;
    private final CommentRepository commentRepository;

    public CommentService(BoardRepository boardRepository, CommentRepository commentRepository) {
        this.boardRepository = boardRepository;
        this.commentRepository = commentRepository;
    }

    public void addComment(AddCommentReqDto addCommentDto) {
        Comment comment = Comment.builder()
                .content(addCommentDto.getContent())
                .board(boardRepository.getById(addCommentDto.getParentId()))
                .build();
        commentRepository.save(comment);
        log.info("댓글 추가");
    }

    public SearchCommentResDto searchComment(Long boardId) {
        log.info("댓글 조회");

        List<Comment> commentList = commentRepository.getByBoardId(boardId);
        List<SearchCommentDto> collect = commentList.stream().map(
                it -> SearchCommentDto.builder()
                        .commentId(it.getCommentId())
                        .content(it.getContent())
                        .registerTime(it.getRegisterTime())
                        .build()
        ).collect(Collectors.toList());

        return SearchCommentResDto.builder()
                .commentList(collect)
                .build();
    }

    public void changeComment(ChangeCommentReqDto changeCommentDto) {
        log.info("댓글 변경");
        Comment comment = commentRepository.findById(changeCommentDto.getCommentId()).get();
        comment.change(changeCommentDto.getContent());
        commentRepository.save(comment);
    }

    public void deleteComment(Long commentId) {
        Comment comment = commentRepository.findById(commentId).get();
        commentRepository.delete(comment);
        log.info("댓글 삭제");
    }

    public void addLike(AddFeelingtReqDto addFeelingtDto) {
        log.info("댓글 좋아요 알림 설정까지 따르르르릉");
    }
}
