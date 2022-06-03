package br.com.albertoferes.suggestionbox.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.albertoferes.suggestionbox.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
    Curso findByDescricao(String descricao);
    List<Curso> findByDescricaoContaining(String descricao);
}
