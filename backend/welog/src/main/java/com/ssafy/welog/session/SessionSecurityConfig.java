package com.ssafy.welog.session;

import com.ssafy.welog.common.util.RedisUtil;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class SessionSecurityConfig extends
    SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    private final RedisUtil redisUtil;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    public SessionSecurityConfig(RedisUtil redisUtil, AuthenticationManagerBuilder authenticationManagerBuilder){
        this.redisUtil = redisUtil;
        this.authenticationManagerBuilder = authenticationManagerBuilder;
    }
    @Override
    public void configure(HttpSecurity http) {
        SessionFilter customFilter = new SessionFilter(redisUtil,authenticationManagerBuilder);
        http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
