package com.proyectorecetas.configuraciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
	@EnableWebSecurity
	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	    @Bean
	    public UserDetailsService userDetailsService() {
	    	UserDetails user = User.withDefaultPasswordEncoder()
	    			.username("admin").password("admin").roles("ADMIN")
	    			.build();
	
	        return new InMemoryUserDetailsManager(user);
	    }
	
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	            .authorizeRequests(requests -> requests
	            	.antMatchers("/login", "/login-error").permitAll()
	                .antMatchers("/admin/**").hasRole("ADMIN")
	                .antMatchers(HttpMethod.POST, "/admin/insertar").permitAll()
	                .anyRequest().permitAll()
	            )
	            .formLogin(form -> form
	                .loginPage("/login")
	                .failureUrl("/login-error")
	                .permitAll()
	            )
	            .logout(logout -> logout
	                    .logoutUrl("/logout") 
	                    .logoutSuccessUrl("/logout-success")
	                    .invalidateHttpSession(true) 
	                    .deleteCookies("JSESSIONID") 
	                    .permitAll()
	                )
	            .csrf().disable();
	    }
}