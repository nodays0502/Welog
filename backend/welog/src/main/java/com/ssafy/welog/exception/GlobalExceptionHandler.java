package com.ssafy.welog.exception;
import com.ssafy.welog.exception.board.BoardNotFoundException;
import com.ssafy.welog.exception.user.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static com.ssafy.welog.common.util.constants.ResponseConstants.*;


@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status,
            WebRequest request) {
        log.debug("유효성 검사 실패", ex);
        return VALIDATION_FAILED;
    }
    // 존재하지 않는 게시글에 대한 에러 핸들러
    @ExceptionHandler(BoardNotFoundException.class)
    public final ResponseEntity<String> handleBoardNotFoundException(
        BoardNotFoundException ex) {
        log.debug("존재하지 않는 게시글", ex);
        return BOARD_NOT_FOUND;
    }

    // 이미 존재하는 Email 가입에 대한 에러 핸들러
    @ExceptionHandler(UserDuplicateEmailException.class)
    public final ResponseEntity<String> handleUserDuplicateEmailException(
        UserDuplicateEmailException ex) {
        log.debug("중복 Email", ex);
        return DUPLICATION_EMAIL;
    }

    // 이미 존재하는 Nickname 가입에 대한 에러 핸들러
    @ExceptionHandler(UserDuplicateNicknameException.class)
    public final ResponseEntity<String> handleUserDuplicateNicknameException(
        UserDuplicateNicknameException ex) {
        log.debug("중복 Nickname", ex);
        return DUPLICATION_NICKNAME;
    }


    // 존재하지 않는 유저 정보 조회에 대한 에러 핸들러
    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<String> handleUserNotFoundException(UserNotFoundException ex) {
        log.debug("존재하지 않는 유저", ex);
        return USER_NOT_FOUND;
    }

    // 입력해야하는 파라미터 중에 입력하지 않은 파라미터가 존재하는 경우
    @ExceptionHandler(NotValidRequestParamException.class)
    public final ResponseEntity<String> handleNotValidRequestParamException(
        NotValidRequestParamException ex) {
        log.debug("입력하지 않은 파라미터 존재", ex);
        return NOT_VALID_PARAM;
    }

    @ExceptionHandler(UnauthorizedException.class)
    public final ResponseEntity<String> handleUnauthorizedException(UnauthorizedException ex) {
        log.debug("권한 없음", ex);
        return UNAUTHORIZED_USER;
    }

    // 5xx error handler : 서버에서 발생한 전반적인 에러에 대한 핸들러
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        log.debug("server error", ex);
        return GENERAL_SERVER_ERROR;
    }

}
