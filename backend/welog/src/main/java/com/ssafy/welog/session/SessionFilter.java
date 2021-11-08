package com.ssafy.welog.session;

import com.ssafy.welog.common.util.RedisUtil;
import com.ssafy.welog.domain.common.AuthLevel;
import com.ssafy.welog.domain.entity.User;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;

public class SessionFilter extends GenericFilterBean {

    private static final Logger logger = LoggerFactory.getLogger(SessionFilter.class);
    public static final String AUTHORIZATION_HEADER = "Authorization";
    private final RedisUtil redisUtil;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    public SessionFilter(RedisUtil redisUtil, AuthenticationManagerBuilder authenticationManagerBuilder){
        this.redisUtil = redisUtil;
        this.authenticationManagerBuilder = authenticationManagerBuilder;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
        FilterChain filterChain)
        throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String sessionId = resolveSessionId(httpServletRequest);
        String requestURI = httpServletRequest.getRequestURI();
        logger.debug("doFilter 들어옴");
        if (StringUtils.hasText(sessionId) && redisUtil.get(sessionId) != null) {
            User user = (User)redisUtil.get(sessionId);

            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                user.getUserName(), null, authorities(user.getUserRole()));
            System.out.println("user:"+user);
//            UsernamePasswordAuthenticationToken authenticationToken =
//                new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword());
//
//            Authentication authentication = authenticationManagerBuilder.getObject()
//                .authenticate(authenticationToken);
//
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//
//            String authorities = getAuthorities(authentication);

            SecurityContextHolder.getContext().setAuthentication(authentication);
            logger.debug("Security Context에 '{}' 인증 정보를 저장했습니다, uri: {}", authentication.getName(),
                requestURI);
        } else {
            logger.debug("유효한 SessionId가 없습니다, uri: {}", requestURI);
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    /*
     * HTTP Request 헤더에서 토큰만 추출하기 위한 메서드
     */
    private String resolveSessionId(HttpServletRequest request) {
        String bearerToken = request.getHeader(AUTHORIZATION_HEADER);
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }

    // 권한 가져오기
    public String getAuthorities(Authentication authentication) {
        return authentication.getAuthorities().stream()
            .map(GrantedAuthority::getAuthority)
            .collect(Collectors.joining(","));
    }
    private Collection<? extends GrantedAuthority> authorities(AuthLevel role) {
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_" + role.toString()));
    }
}
