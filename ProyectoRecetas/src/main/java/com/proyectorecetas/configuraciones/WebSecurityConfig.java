package com.proyectorecetas.configuraciones;




//	@Configuration
//	@EnableWebSecurity
//	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	    @Bean
//	    public UserDetailsService userDetailsService() {
//	    	UserDetails user = User.withDefaultPasswordEncoder()
//	    			.username("admin").password("admin").roles("ADMIN")
//	    			.build();
//	
//	        return new InMemoryUserDetailsManager(user);
//	    }
//	
	//    @Override
	//    protected void configure(HttpSecurity http) throws Exception {
	//        http
	//            .authorizeRequests(requests -> requests
	//            	.antMatchers("/login", "/login-error").permitAll()
	//                .antMatchers("/admin/**").hasRole("ADMIN")
	//                .antMatchers(HttpMethod.POST, "/admin/insertar").permitAll()
	//                .anyRequest().permitAll()
	//            )
	//            .formLogin(form -> form
	//                .loginPage("/login")
	//                .failureUrl("/login-error")
	//                .permitAll()
	//            )
	//            .logout(logout -> logout
	//                    .logoutUrl("/logout") 
	//                    .logoutSuccessUrl("/") 
	//                    .invalidateHttpSession(true) 
	//                    .deleteCookies("JSESSIONID") 
	//                    .permitAll()
	//                );
	//    }
//}