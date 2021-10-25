package com.ssafy.welog.common.util;

import java.util.List;


/*
    @WithAuthUser 어노테이션의 동작을 위한 SecurityContextFactory
 */

//public class WithAuthUserSecurityContextFactory implements
//    WithSecurityContextFactory<WithAuthUser> {
//
//    @Override
//    public SecurityContext createSecurityContext(WithAuthUser annotation) {
//        String email = annotation.email();
//        String role = annotation.role();
//
//        UserBase authUser = UserBase.builder()
//            .email(email)
//            .authority(new Authority(role))
//            .build();
//
//        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
//            authUser, "password",
//            List.of(new SimpleGrantedAuthority(role)));
//        SecurityContext context = SecurityContextHolder.getContext();
//        context.setAuthentication(token);
//        return context;
//    }
//}
