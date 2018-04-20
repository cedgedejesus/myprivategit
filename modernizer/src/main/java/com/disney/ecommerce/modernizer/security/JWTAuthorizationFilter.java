package com.disney.ecommerce.modernizer.security;

import io.jsonwebtoken.Jwts;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


import static com.disney.ecommerce.modernizer.security.SecurityConstants.HEADER_STRING;
import static com.disney.ecommerce.modernizer.security.SecurityConstants.SECRET;
import static com.disney.ecommerce.modernizer.security.SecurityConstants.TOKEN_PREFIX;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

	public JWTAuthorizationFilter(AuthenticationManager authManager) {
		super(authManager);
	}
	   @Override
	    protected void doFilterInternal(HttpServletRequest req,
	                                    HttpServletResponse res,
	                                    FilterChain chain) throws IOException, ServletException {
		   System.out.println("Renz 555");
	        String header = req.getHeader(HEADER_STRING);

	        if (header == null || !header.startsWith(SECRET)) {
	            chain.doFilter(req, res);
	            return;
	        }

	        UsernamePasswordAuthenticationToken authentication = getAuthentication(req);

	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        chain.doFilter(req, res);
	    }

	    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
	    	System.out.println("Renz 777");
	        String token = request.getHeader(HEADER_STRING);
	        if (token != null) {
	            // parse the token.
	            String user = Jwts.parser()
	                    .setSigningKey(SECRET.getBytes())
	                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
	                    .getBody()
	                    .getSubject();

	            if (user != null) {
	                return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
	            }
	            return null;
	        }
	        return null;
	    }
	}