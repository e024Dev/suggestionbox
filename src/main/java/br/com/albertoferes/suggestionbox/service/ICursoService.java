package br.com.albertoferes.suggestionbox.service;

import java.util.List;

import br.com.albertoferes.suggestionbox.model.Curso;

public interface ICursoService {
    Curso salvar(Curso curso);
    Curso buscar(Integer id);
    void remover(Integer id);
    List<Curso> buscarTodos();
    List<Curso> buscarPorNome(String nome);
}
