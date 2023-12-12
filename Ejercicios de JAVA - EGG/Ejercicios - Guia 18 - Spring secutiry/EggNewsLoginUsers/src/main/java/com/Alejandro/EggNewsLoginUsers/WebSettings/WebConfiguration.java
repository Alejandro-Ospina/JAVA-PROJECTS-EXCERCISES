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
                                .requestMatchers("/css/**", "/js/**", "/img/**", "/webjars/**").permitAll()
                                .requestMatchers("/login_users/registrar_usuarios").permitAll()
                                .requestMatchers("/crear_noticias/**").hasRole("PERIODISTA")
                                .requestMatchers("/panelAdmin/**").hasAnyRole("ADMIN", "PERIODISTA")
                                .anyRequest().authenticated())
                .formLogin(flogin ->
                        flogin.loginPage("/login_users").permitAll())
                .logout(logout -> logout.deleteCookies().logoutUrl("/logout_users")
                        .logoutSuccessUrl("/login_users?logout_users").permitAll())
                .headers(header -> header.xssProtection(Customizer.withDefaults())
                        .cacheControl(cacheControlConfig -> cacheControlConfig.disable()))
                .csrf(csrf -> csrf.disable())
                .cors(Customizer.withDefaults());
        return http.build();
    }
}