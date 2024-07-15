package br.com.alura.forumhub.cursos.dto;

import br.com.alura.forumhub.cursos.CategoriaCurso;
import br.com.alura.forumhub.cursos.Curso;

public record CursoExposicaoDto (
        String nome,
        CategoriaCurso categoria
) {
    public CursoExposicaoDto(Curso curso){
        this(curso.getNome(), curso.getCategoria());
    }
}
