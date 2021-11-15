package com.ssafy.welog.common.config;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/*
 *  유효한 자격증명을 제공하지 않고 접근하려 할 때 에러 처리
 */
@Component
public class SecurityAuthenticationEntryPoint implements
    org.springframework.security.web.AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request,
        HttpServletResponse response,
        AuthenticationException authException) throws IOException {

        response.sendError(HttpServletResponse.SC_UNAUTHORIZED); // 401에러
    }
}
