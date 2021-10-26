package com.ssafy.welog.api.controller;


import com.ssafy.welog.api.controller.dto.BoardDto;
import com.ssafy.welog.service.BoardService;
import com.ssafy.welog.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Void> addBoard(AddBoardReqDto addBoardDto) {
        boardService.addBoard(addBoardDto);
        return OK;
    }

    /*
     * 게시글 전체 조회
     */
    @GetMapping
    public ResponseEntity<SearchBoardResDto> searchAllBoard(@RequestParam("page") int page) {
        SearchBoardResDto searchBoardResDto = boardService.searchAllBoard(page);
        return ResponseEntity.ok(searchBoardResDto);
    }

    /*
     * 게시글 상세 조회
     */
    @GetMapping("/{boardId}")
    public ResponseEntity<SearchBoardResDto> searchBoard(@PathVariable Long boardId) {
        SearchBoardResDto searchBoardResDto = boardService.searchBoard(boardId);
        return ResponseEntity.ok(searchBoardResDto);
    }

    /*
     * 게시글 수정
     */
    @PutMapping
    public ResponseEntity<Void> changeBoard(BoardDto.ChangeBoardReqDto changeBoardDto) {
        boardService.changeBoard(changeBoardDto);
        return OK;
    }
    /*
     * 게시글 삭제
     */
    @DeleteMapping("/{boardId}")
    public ResponseEntity<Void> deleteBoard(@PathVariable Long boardId) {
        boardService.deleteBoard(boardId);
        return OK;
    }



}
