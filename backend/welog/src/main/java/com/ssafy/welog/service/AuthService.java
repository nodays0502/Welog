package com.ssafy.welog.service;

import com.ssafy.welog.api.controller.dto.AuthDto.LoginReqDto;
import com.ssafy.welog.api.controller.dto.AuthDto.LoginResDto;
import com.ssafy.welog.common.util.RedisUtil;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.domain.entity.UserRepository;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Slf4j
@Service
@Transactional(readOnly = true)
public class AuthService {

    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final RedisUtil redisUtil;
    private final UserRepository userRepository;

    public AuthService(AuthenticationManagerBuilder authenticationManagerBuilder,
        RedisUtil redisUtil, UserRepository userRepository) {
        this.authenticationManagerBuilder = authenticationManagerBuilder;
        this.redisUtil = redisUtil;
        this.userRepository = userRepository;
    }

    public void login(LoginReqDto loginReqDto , HttpSession httpSession) {
        log.info("로그인 시작");
        String userEmail = loginReqDto.getUserEmail();
        String password = loginReqDto.getPassword();
        User user = userRepository.findByUserEmail(userEmail).get();
        UsernamePasswordAuthenticationToken authenticationToken =
            new UsernamePasswordAuthenticationToken(user.getUserName(), password);

        Authentication authentication = authenticationManagerBuilder.getObject()
            .authenticate(authenticationToken);

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String authorities = getAuthorities(authentication);
        System.out.println("authorities:"+authorities);

        httpSession.setAttribute("user",user);
        httpSession.setMaxInactiveInterval(60);


        String sessionId = UUID.randomUUID().toString();

//        redisUtil.set(sessionId, user, 30);
//        TokenDto tokenDto = tokenProvider.createToken(authentication.getName(), authorities);

//        redisUtil.set(userEmail, tokenDto.getRefreshToken(), 60 * 24 * 7);
        log.info("로그인 끝");
//        return LoginResDto.builder()
////            .sessionId(UUID.randomUUID().toString())
//            .sessionId(sessionId)
//            .build();
    }

    public void logout(String sessionId) {
        redisUtil.delete(sessionId);
        log.info("로그아웃");
    }

    // 권한 가져오기
    public String getAuthorities(Authentication authentication) {
        return authentication.getAuthorities().stream()
            .map(GrantedAuthority::getAuthority)
            .collect(Collectors.joining(","));
    }
}
