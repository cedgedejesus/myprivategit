package com.disney.ecommerce.modernizer.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurity extends WebSecurityConfigurerAdapter {

	private UserDetailsService userDetailsService;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public WebSecurity(UserDetailsService userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userDetailsService = userDetailsService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {	
		System.out.println("Renz hhh");
		 http
		 .cors()
		 .and()
		 .csrf().disable()
		 .authorizeRequests()
		 .antMatchers("/swagger-ui.html#/").permitAll()
		 .antMatchers("/v2/api-docs").permitAll()
		 .antMatchers("/user/guest").permitAll()
		 .antMatchers("/hotel/**").authenticated()
		 .antMatchers("/addon/**").authenticated()
		 .antMatchers("/transport/**").authenticated()
		 .antMatchers("/cart/**").authenticated()
		 .antMatchers("/booking/**").authenticated()
		 .antMatchers("/payment/**").authenticated()
		 .antMatchers("/config/**").authenticated()
		 .antMatchers("/user/guest/**").authenticated()
		 .and()
		 .addFilter(new JWTAuthenticationFilter(authenticationManager()))
		 .addFilter(new JWTAuthorizationFilter(authenticationManager()))
		 .sessionManagement()
		 .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		 
         
         
        		 
         
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("Renz!!");
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		System.out.println("Renz kkk");
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
		return source;
	}
}