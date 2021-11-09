package com.ssafy.welog.common.util.constants;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseConstants {

    public static final ResponseEntity<Void> OK =
        ResponseEntity.ok().build();

    public static final ResponseEntity<Void> CREATED =
        ResponseEntity.status(HttpStatus.CREATED).build();

    public static final ResponseEntity<Void> BAD_REQUEST =
        ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

//    public static final ResponseEntity<Object> VALIDATION_FAILED =
//        new ResponseEntity("validation_failed", HttpStatus.BAD_REQUEST);

    public static final ResponseEntity<String> WORD_NOT_VALID =
        new ResponseEntity<>("조건에 맞지 않는 word 입니다. : not null && 1 <= word.length <= 10",
            HttpStatus.BAD_REQUEST);

    public static final ResponseEntity<String> FORBIDDEN =
        new ResponseEntity<>("금지된 요청", HttpStatus.FORBIDDEN);

    public static final ResponseEntity<String> LIST_NPE =
        new ResponseEntity<>("API 연결 실패: List", HttpStatus.INTERNAL_SERVER_ERROR);

    public static final ResponseEntity<String> DATA_TREND_NPE =
        new ResponseEntity<>("API 연결 실패: DataTrend", HttpStatus.INTERNAL_SERVER_ERROR);

    public static final ResponseEntity<Object> VALIDATION_FAILED =
            new ResponseEntity<>("유효성 검사에 실패 하였습니다.", HttpStatus.BAD_REQUEST);

    public static final ResponseEntity<String> DUPLICATION_EMAIL =
            new ResponseEntity<>("이메일이 중복되었습니다.", HttpStatus.BAD_REQUEST);

    public static final ResponseEntity<String> DUPLICATION_NICKNAME =
            new ResponseEntity<>("닉네임이 중복되었습니다.", HttpStatus.BAD_REQUEST);

    public static final ResponseEntity<String> USER_NOT_FOUND =
            new ResponseEntity<>("유저가 존재하지 않습니다.", HttpStatus.BAD_REQUEST);

    public static final ResponseEntity<String> NOT_VALID_PARAM =
            new ResponseEntity<>("입력하지 않은 파라미터가 존재합니다.", HttpStatus.BAD_REQUEST);

    public static final ResponseEntity<String> UNAUTHORIZED_USER =
            new ResponseEntity<>("권한이 없습니다.", HttpStatus.BAD_REQUEST);

    public static final ResponseEntity<Object> GENERAL_SERVER_ERROR =
            new ResponseEntity<>("서버 에러.", HttpStatus.INTERNAL_SERVER_ERROR);

}
