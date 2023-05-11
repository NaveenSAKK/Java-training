package com.nav.secondSpringProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity(debug = true)
@EnableMethodSecurity
public class TravellerSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests().requestMatchers("/welcome/**").permitAll()
                .requestMatchers("/login/**").permitAll()
                .requestMatchers("/list/**").permitAll()
                .requestMatchers("/requestlocaltour/**").authenticated()
                .requestMatchers("/requestforeigntour/**").authenticated()
                .requestMatchers("/addtraveller/**").authenticated()
                .requestMatchers("/listtravellers/**").permitAll().and().httpBasic();
        http.cors();
        http.csrf().disable(); // 403forbidden error
        return http.build();
    }
}
