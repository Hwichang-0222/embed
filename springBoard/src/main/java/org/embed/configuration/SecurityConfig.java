package org.embed.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        
        http
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()  // 모든 요청 허용 (개발용)
            )
            .csrf(csrf -> csrf.disable())  // CSRF 비활성화 (개발용)
            .formLogin(form -> form.disable())  // 기본 로그인 폼 비활성화
            .httpBasic(basic -> basic.disable());  // HTTP Basic 인증 비활성화
        
        return http.build();
    }
    
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        
        return (web) -> web.ignoring().requestMatchers(
            "/bookmarket/**",      // ** 로 변경 - 모든 하위 경로 포함
            "/board/**",           // 게시판
            "/api/**",             // API
            "/css/**",             // CSS
            "/js/**",              // JavaScript
            "/images/**",          // 이미지
            "/error",              // 에러 페이지
            "/error/**",
            "/favicon.ico"
        );
    }
    
    @Bean
    public HttpFirewall defaultHttpFirewall() {
        return new DefaultHttpFirewall();
    }
}