package br.com.alura.forumhub.usuarios.dto;

import br.com.alura.forumhub.usuarios.Usuario;

public record UsuarioExposicaoDto(
        String nome,
        String email
) {
    public UsuarioExposicaoDto(Usuario dados) {
        this(dados.getNome(), dados.getEmail());
    }
}
