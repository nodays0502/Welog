package com.ssafy.welog.api.controller;


import com.ssafy.welog.api.controller.dto.BoardDto;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.service.BoardService;
import com.ssafy.welog.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import static com.ssafy.welog.common.util.constants.ResponseConstants.OK;
import com.ssafy.welog.api.controller.dto.BoardDto.*;


@Slf4j
@RestController
@RequestMapping("/api/board")
public class BoardApiController {

    private final BoardService boardService;

    public BoardApiController(BoardService boardService) {
        this.boardService = boardService;
    }

    /*
     * 게시글 등록
     */
    @PostMapping
    public ResponseEntity<Void> addBoard(@AuthenticationPrincipal User user,
        @RequestBody AddBoardReqDto addBoardDto) {
        boardService.addBoard(user,addBoardDto);
        return OK;
    }

    /*
     * 게시글 전체 조회
     */
    @GetMapping
    public ResponseEntity<SearchBoardResDto> searchAllBoard(PageDto page) {
        return ResponseEntity.ok(boardService.searchAllBoard(page));
    }

    /*
     * 게시글 상세 조회
     */
    @GetMapping("/{boardId}")
    public ResponseEntity<SearchBoardDto> searchBoard(@PathVariable Long boardId) {
        return ResponseEntity.ok(boardService.searchBoard(boardId));
    }

    /*
     * 게시글 수정
     */
    @PatchMapping
    public ResponseEntity<Void> changeBoard(@AuthenticationPrincipal User user,@RequestBody ChangeBoardReqDto changeBoardDto) {
        boardService.changeBoard(user,changeBoardDto);
        return OK;
    }
    /*
     * 게시글 삭제
     */
    @DeleteMapping("/{boardId}")
    public ResponseEntity<Void> deleteBoard(@AuthenticationPrincipal User user, @PathVariable Long boardId) {
        boardService.deleteBoard(user,boardId);
        return OK;
    }



}
