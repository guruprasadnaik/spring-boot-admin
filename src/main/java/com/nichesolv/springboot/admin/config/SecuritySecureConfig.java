package com.nichesolv.springboot.admin.config;

import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class SecuritySecureConfig {

//    private final AdminServerProperties adminServer;
//
//    public SecuritySecureConfig(AdminServerProperties adminServer) {
//        this.adminServer = adminServer;
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.cors()
//                .and()
//                .authorizeHttpRequests()
//                .anyRequest().permitAll();
//        return http.build();
//    }
}