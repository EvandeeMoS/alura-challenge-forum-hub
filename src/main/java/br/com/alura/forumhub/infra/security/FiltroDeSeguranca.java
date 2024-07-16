package br.com.alura.forumhub.infra.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class FiltroDeSeguranca extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String jwtToken = request.getHeader("authorization");
        if (jwtToken == null) {
            throw new RuntimeException("Token JWT não enviado no cabeçalho authorization");
        }
        System.out.println(jwtToken);
        filterChain.doFilter(request, response);
    }
}
