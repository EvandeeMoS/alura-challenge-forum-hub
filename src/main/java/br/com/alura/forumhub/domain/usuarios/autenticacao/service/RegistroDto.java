package br.com.alura.forumhub.domain.usuarios.autenticacao.service;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record RegistroDto(
        @NotEmpty
        String nome,
        @NotEmpty
        @Email
        String email,
        @NotEmpty
        String senha,
        @NotNull
        long idPerfil
) {
}
