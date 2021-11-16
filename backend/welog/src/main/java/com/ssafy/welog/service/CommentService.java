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
import com.ssafy.welog.domain.entity.*;
import com.ssafy.welog.domain.repository.*;
import com.ssafy.welog.exception.user.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CommentService {
    private final UserRepository userRepository;
    private final BoardRepository boardRepository;
    private final CommentRepository commentRepository;
    private final FeelingRepository feelingRepository;

    public CommentService(UserRepository userRepository, BoardRepository boardRepository, CommentRepository commentRepository, FeelingRepository feelingRepository) {
        this.userRepository = userRepository;
        this.boardRepository = boardRepository;
        this.commentRepository = commentRepository;
        this.feelingRepository = feelingRepository;
    }

    public void addComment(User user, AddCommentReqDto addCommentDto) {
        try {
            User writer = userRepository.findById(user.getUserId())
                    .orElseThrow(() -> new UserNotFoundException("해당하는 유저가 존재하지 않습니다."));
            Comment comment = Comment.builder()
                    .content(addCommentDto.getContent())
                    .board(boardRepository.getById(addCommentDto.getParentId()))
                    .user(writer)
                    .build();
            commentRepository.save(comment);
            log.info("댓글 추가");
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public void changeComment(User user, ChangeCommentReqDto changeCommentDto) {
        log.info("댓글 변경");
        User writer = userRepository.findById(user.getUserId()).get();
        Comment comment = commentRepository.findById(changeCommentDto.getCommentId()).get();

        if (writer.getUserId().equals(comment.getUser().getUserId())) {
            comment.change(changeCommentDto.getContent());
            commentRepository.save(comment);
        } else {
            // 에러 권한 없음
            log.info("에러 발생");
        }
    }

    public void deleteComment(Long commentId) {
        Comment comment = commentRepository.findById(commentId).get();
        commentRepository.delete(comment);
        log.info("댓글 삭제");
    }

    public void addLike(User user, AddFeelingtReqDto addFeelingtDto) {
        log.info("댓글 좋아요/싫어요 등록 및 삭제");
        Comment comment = commentRepository.findById(addFeelingtDto.getCommentId()).get();
        User writer = userRepository.findById(user.getUserId()).get();
        List<Feel> feels = feelingRepository.getByCommentIdAndUserId(comment.getCommentId(), writer.getUserId());
        if (feels.isEmpty()) { // 사용자가 좋아요/싫어요 안눌렀으면
            Feel feel = Feel.builder()
                    .comment(comment)
                    .user(writer)
                    .feeling(addFeelingtDto.getFeeling())
                    .build();

            feelingRepository.save(feel); // 좋아요/싫어요 등록하기
        }
        else { // 기존에 저장된게 있으면
            Feel feel = feels.stream().findFirst().get();
            if (feel.getFeeling() == addFeelingtDto.getFeeling()) // 같은경우 삭제
                feelingRepository.delete(feel);
            else {
                feel.change(addFeelingtDto.getFeeling()); // 다를경우 변경
                feelingRepository.save(feel);
            }
        }
    }
}
