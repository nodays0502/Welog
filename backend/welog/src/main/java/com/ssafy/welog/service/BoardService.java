package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.BoardDto;
import com.ssafy.welog.api.controller.dto.BoardDto.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;

@Slf4j
@Service
public class BoardService {
    public void addBoard(AddBoardReqDto addBoardDto){
        log.info("게시글 등록");
    }
    public SearchBoardResDto searchAllBoard(PageDto page){
        log.info("게시글 전체 조회");
        return SearchBoardResDto.builder().boardList(new ArrayList<>()).build();
    }

    public SearchBoardDto searchBoard(Long boardId){
        log.info("게시글 상세 조회");
        return SearchBoardDto.builder().build();
    }


    public void changeBoard(BoardDto.ChangeBoardReqDto changeBoardDto){
        log.info("게시글 수정");
    }
    public void deleteBoard(Long boardId){
        log.info("게시글 삭제");
    }

    public void addFavorite(Long boardId){
        log.info("즐겨찾기 등록");
    }

    public void deleteFavorite(Long boardId){
        log.info("즐겨찾기 삭제");
    }

}
