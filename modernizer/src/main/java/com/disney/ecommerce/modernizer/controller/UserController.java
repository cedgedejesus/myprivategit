package com.disney.ecommerce.modernizer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ecommerce.modernizer.domain.ApplicationUser;
import com.disney.ecommerce.modernizer.security.JWTUtil;
import com.disney.ecommerce.modernizer.security.SecurityConstants;
/**
* HotelController contains all the RESTFul APIs for Hotel Management.
*
* @author  Renino Niefes
* @version 1.0
* @since   2018-04-19 
*/
@RestController
public class UserController {	
	@PostMapping("login")	
	public ResponseEntity<String> login(@RequestBody ApplicationUser input) {
		JWTUtil jwtUtil = new JWTUtil();
		String token = jwtUtil.createJWT(input.getUsername(), "disney", "modernizer", SecurityConstants.EXPIRATION_TIME);
		return new ResponseEntity<String>(token, HttpStatus.OK);
	}
}
