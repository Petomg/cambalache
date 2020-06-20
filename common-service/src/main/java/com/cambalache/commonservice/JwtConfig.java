package com.cambalache.commonservice;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.ToString;

@Getter 		// lombok will create getters auto.
@ToString
public class JwtConfig {
    @Value("${security.jwt.uri:/auth/**}")
    private String Uri;

    @Value("${security.jwt.header:Authorization}")
    private String header;

    @Value("${security.jwt.prefix:Bearer}")
    private String prefix;

    @Value("${security.jwt.expiration:#{24*60*60}}")
    private int expiration;

    @Value("${security.jwt.secret:JwtSecretKey}")
    private String secret;

    String getUri(){
        return Uri;
    }

    String getHeader(){
        return header;
    }

    String getPrefix(){
        return prefix;
    }

    int getExpiration(){
        return expiration;
    }

    String getSecret(){
        return secret;
    }
}
