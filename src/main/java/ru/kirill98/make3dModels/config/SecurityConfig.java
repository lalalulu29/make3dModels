package ru.kirill98.make3dModels.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeHttpRequests()
                .mvcMatchers("/log/**").hasRole("ADMIN")
                .and()
                .formLogin()
                .and()
                .logout()
                .logoutSuccessUrl("/")
                .and();
    }


    @Bean
	public UserDetailsService users() {
		UserDetails admin = User.builder()
				.username("admin")
				.password("")
				.roles("USER", "ADMIN", "SUPERADMIN")
				.build();
		UserDetails user = User.builder()
				.username("user")
				.password("")
				.roles("USER")
				.build();

		return new InMemoryUserDetailsManager(user, admin);
	}
}
