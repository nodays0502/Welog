package com.ssafy.welog.common.config;


/*
    Spring Security 환경설정
 */


import com.ssafy.welog.common.util.RedisUtil;
import com.ssafy.welog.session.SessionSecurityConfig;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final RedisUtil redisUtil;
    private final SecurityAuthenticationEntryPoint authenticationEntryPoint;
    private final SecurityAccessDeniedHandler authAccessDeniedHandler;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    public SecurityConfig(RedisUtil redisUtil,
        AuthenticationManagerBuilder authenticationManagerBuilder,
        SecurityAccessDeniedHandler authAccessDeniedHandler,
        SecurityAuthenticationEntryPoint authenticationEntryPoint) {
        this.redisUtil = redisUtil;
        this.authenticationManagerBuilder = authenticationManagerBuilder;
        this.authAccessDeniedHandler = authAccessDeniedHandler;
        this.authenticationEntryPoint = authenticationEntryPoint;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring()
            .antMatchers(
                "/h2-console/**")
            .antMatchers("/favicon.ico", "/error")
            //swagger
            .antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources",
                "/configuration/security", "/swagger-ui.html", "/webjars/**", "/swagger/**");
        ;
        web.ignoring().antMatchers("/api/docs/**");
        web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        JwtFilter jwtFilter = new JwtFilter(tokenProvider);
        httpSecurity
            // token을 사용하는 방식이기 때문에 csrf를 disable합니다.
            .csrf().disable()

            .cors().configurationSource(corsConfigurationSource())
            .and()
            .exceptionHandling()
            .authenticationEntryPoint(authenticationEntryPoint)
            .accessDeniedHandler(authAccessDeniedHandler)
            // jwt 토큰 필터 ADD
            .and()
//            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
            // enable h2-console
            .headers()
            .frameOptions()
            .sameOrigin()

            // 세션을 사용하지 않기 때문에 STATELESS로 설정
            .and()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)

            .and()
            .authorizeRequests()
            .antMatchers("/api/auth").permitAll()
            .antMatchers("/api/user").permitAll()
            .antMatchers("/api/docs/api-doc.html").permitAll()
            .antMatchers("/api/search/**").permitAll()
            .antMatchers("/swagger-resources/**").permitAll()

            .anyRequest().authenticated()

            .and()
            .apply(new SessionSecurityConfig(redisUtil, authenticationManagerBuilder));
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();

//        configuration.addAllowedOrigin("http://k5B305.p.ssafy.io:3000");
//        configuration.addAllowedOrigin("https://k5B305.p.ssafy.io");
//        configuration.addAllowedOrigin("http://localhost:3000");
        configuration.addAllowedOrigin("*");
        configuration.addAllowedHeader("*");
        configuration.addAllowedMethod("*");
//        configuration.setAllowCredentials(true);
        configuration.setAllowCredentials(false);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/api/**", configuration);
        return source;
    }
}
