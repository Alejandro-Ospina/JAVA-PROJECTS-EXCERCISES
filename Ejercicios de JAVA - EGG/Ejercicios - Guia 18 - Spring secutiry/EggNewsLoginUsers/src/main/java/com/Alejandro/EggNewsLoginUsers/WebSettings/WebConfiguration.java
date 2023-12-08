package com.Alejandro.EggNewsLoginUsers.WebSettings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity (securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
public class WebConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize ->
                        authorize
                                .requestMatchers("/login_users", "/css/**", "/js/**", "/img/**", "/**").permitAll()
                                .requestMatchers("/panelAdmin/**")
                                .hasAnyRole("ADMIN", "PERIODISTA")
                                .anyRequest().authenticated())
                .headers(header ->  header.xssProtection(Customizer.withDefaults()))
                .httpBasic(Customizer.withDefaults())
                .csrf(csrf -> csrf.disable())
                .cors(Customizer.withDefaults());
        return http.build();
    }
}