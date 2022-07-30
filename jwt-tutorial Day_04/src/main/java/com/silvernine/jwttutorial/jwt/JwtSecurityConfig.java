package com.silvernine.jwttutorial.jwt;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


//== (1) tokenProvider, JwtFilter를 SecurityConfig에 적용할때 사용할 JwtSecurityConfig 클래스
//== (1) JwtSecurityConfig는 SecurityConfigurerAdapter을 extends 받고 okenProvider을 주입 받는다.

public class JwtSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    private TokenProvider tokenProvider;

    public JwtSecurityConfig(TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    //== (2) configure를 Override헤서 만들었던 JwtFilter를 addFilterBefore 로직에 등록하는 일을 수
    @Override
    public void configure(HttpSecurity http) {
        JwtFilter customFilter = new JwtFilter(tokenProvider);
        http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
