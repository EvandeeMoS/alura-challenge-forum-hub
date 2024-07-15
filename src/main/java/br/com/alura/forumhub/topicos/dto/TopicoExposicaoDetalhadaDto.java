package br.com.alura.forumhub.topicos.dto;

import br.com.alura.forumhub.cursos.dto.CursoExposicaoDto;
import br.com.alura.forumhub.respostas.RespostaExposicaoDto;
import br.com.alura.forumhub.topicos.StatusTopico;
import br.com.alura.forumhub.topicos.Topico;
import br.com.alura.forumhub.usuarios.dto.UsuarioExposicaoDto;

import java.time.LocalDateTime;
import java.util.List;

public record TopicoExposicaoDetalhadaDto(
        long id,
        String titulo,
        StatusTopico status,
        LocalDateTime dataCriacao,
        String mensagem,
        UsuarioExposicaoDto autor,
        CursoExposicaoDto curso,
        List<RespostaExposicaoDto> respostas
) {
    public TopicoExposicaoDetalhadaDto(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getStatusTopico(),
                topico.getDataCriacao(),
                topico.getMensagem(),
                new UsuarioExposicaoDto(topico.getAutor()),
                new CursoExposicaoDto(topico.getCurso()),
                topico.getRespostas().stream().map(RespostaExposicaoDto::new).toList());
    }
}
