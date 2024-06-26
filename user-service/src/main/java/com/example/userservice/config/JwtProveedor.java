package com.example.userservice.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class JwtProveedor {

    static SecretKey key= Keys.hmacShaKeyFor(JwtConstant.SECRET_KEY.getBytes());

    public static String generarToken (Authentication auth){
        Collection<? extends GrantedAuthority> autoridades=auth.getAuthorities();

        String roles = poblarAutorizacion(autoridades);

        String jwt= Jwts.builder()
                .setIssuedAt( new Date())
                .setExpiration(new Date(new Date().getTime()+86400000))
                .claim("email",auth.getName())
                .claim("autoridades",roles)
                .signWith(key)
                .compact();
        return jwt;
    }

    public  static  String getEmailFromJwtToken(String jwt){
        jwt=jwt.substring(7);

        Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(jwt).getBody();

        String email=String.valueOf(claims.get("email"));
        return email;

    }
    private static String poblarAutorizacion(Collection<? extends GrantedAuthority> collection) {
        Set<String> auths=new HashSet<>();

        for (GrantedAuthority authority:collection){
            auths.add(authority.getAuthority());
        }
        return String.join(",",auths);
    }
}
