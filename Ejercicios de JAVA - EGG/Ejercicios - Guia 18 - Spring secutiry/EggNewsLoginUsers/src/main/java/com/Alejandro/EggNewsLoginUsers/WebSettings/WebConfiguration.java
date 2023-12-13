package com.Alejandro.EggNewsLoginUsers.WebSettings;

import com.Alejandro.EggNewsLoginUsers.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity (securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
public class WebConfiguration {

    public final UserService userService;

    public WebConfiguration(UserService userService){
        this.userService = userService;
    }
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
                .logout(logout -> logout.logoutUrl("/logout_users")
                        .logoutSuccessUrl("/login_users?logout_users").permitAll()
                        .invalidateHttpSession(true)
                        .deleteCookies())
                .headers(header -> header.xssProtection(Customizer.withDefaults())
                        .cacheControl(cacheControlConfig -> cacheControlConfig.disable()))
                .csrf(csrf -> csrf.disable())
                .cors(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(
            UserDetailsService userDetailsService,
            PasswordEncoder passwordEncoder) {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService);
        authenticationProvider.setPasswordEncoder(passwordEncoder);

        return new ProviderManager(authenticationProvider);
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails = User.builder();
        return new InMemoryUserDetailsManager(userDetails);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}