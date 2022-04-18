package ru.kirill98.make3dModels.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.util.logging.Handler;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();

        http.authorizeHttpRequests()
                .antMatchers("/log/**").hasRole("ADMIN")
                .and()
                .formLogin()
				.and()
                .logout().logoutSuccessUrl("/")
                .and();
    }

	//In memory
    @Bean
	public UserDetailsService users() {
		UserDetails admin = User.builder()
				.username("admin")
				.password("{bcrypt}$2a$12$yhruGmrfcFtusVK/VX29nej4FpFx3IJPvjxUgI89V8sCHFwAqB9TS")
				.roles("USER", "ADMIN", "SUPERADMIN")
				.build();
		UserDetails user = User.builder()
				.username("user")
				.password("{bcrypt}$2a$12$yhruGmrfcFtusVK/VX29nej4FpFx3IJPvjxUgI89V8sCHFwAqB9TS")
				.roles("USER")
				.build();

		return new InMemoryUserDetailsManager(user, admin);
	}

//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//
//	}

}
