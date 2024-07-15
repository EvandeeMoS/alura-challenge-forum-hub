package br.com.alura.forumhub.topicos.dto;

import br.com.alura.forumhub.topicos.StatusTopico;

public record TopicoAtualizacaoDto(
        String titulo,
        String mensagem,
        StatusTopico status
) {
}
