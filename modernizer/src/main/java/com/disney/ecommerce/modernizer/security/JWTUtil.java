package com.disney.ecommerce.modernizer.security;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import org.springframework.stereotype.Component;

import java.security.Key;
import io.jsonwebtoken.*;
import java.util.Date;
import static com.disney.ecommerce.modernizer.security.SecurityConstants.SECRET;

/**
 * JWTUtil contains JWT related actions such as creation of tokens and
 * authentication.
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-04-17
 */
@Component("JWTUtil")
public class JWTUtil {

	public String createJWT(String id, String issuer, String subject, long ttlMillis) {
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);

		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET);
		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

		JwtBuilder builder = Jwts.builder().setId(id).setIssuedAt(now).setSubject(subject).setIssuer(issuer)
				.signWith(signatureAlgorithm, signingKey);

		if (ttlMillis >= 0) {
			long expMillis = nowMillis + ttlMillis;
			Date exp = new Date(expMillis);
			builder.setExpiration(exp);
		}

		return builder.compact();
	}
}
