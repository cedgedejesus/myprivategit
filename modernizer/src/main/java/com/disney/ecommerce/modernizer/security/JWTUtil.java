package com.disney.ecommerce.modernizer.security;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import io.jsonwebtoken.*;
import java.util.Date;  
import static com.disney.ecommerce.modernizer.security.SecurityConstants.SECRET;

/**
* JWTUtil contains JWT related actions such as creation of tokens and 
* authentication.
*
* @author  Renino Niefes
* @version 1.0
* @since   2018-04-17 
*/
@Component("JWTUtil")
public class JWTUtil {	
	public String createJWT(String id, String issuer, String subject, long ttlMillis) {		 
	    SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
	 
	    long nowMillis = System.currentTimeMillis();
	    Date now = new Date(nowMillis);
	 
	    System.out.println(SECRET);
	    
	    byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET);
	    Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
	 
	    JwtBuilder builder = Jwts.builder().setId(id)
	                                .setIssuedAt(now)
	                                .setSubject(subject)
	                                .setIssuer(issuer)
	                                .signWith(signatureAlgorithm, signingKey);
	 
	    if (ttlMillis >= 0) {
	    long expMillis = nowMillis + ttlMillis;
	        Date exp = new Date(expMillis);
	        builder.setExpiration(exp);
	    }
	 
	    return builder.compact();
	}
	
	public void authenticateJWT(String jwt) {
		 
	    //This line will throw an exception if it is not a signed JWS (as expected)
	    Claims claims = Jwts.parser()         
	       .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET))
	       .parseClaimsJws(jwt).getBody();
	    System.out.println("ID: " + claims.getId());
	    System.out.println("Subject: " + claims.getSubject());
	    System.out.println("Issuer: " + claims.getIssuer());
	    System.out.println("Expiration: " + claims.getExpiration());
	}	
}
