package br.com.albertoferes.suggestionbox.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Strings;

import br.com.albertoferes.suggestionbox.model.Curso;
import br.com.albertoferes.suggestionbox.model.repository.CursoRepository;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private CursoRepository repository;

    @Override
    public Curso salvar(Curso curso) {
        if(Strings.isNullOrEmpty(curso.getDescricao())) {
            throw new RuntimeException("O nome do curso não pode estar vazio.");
        }
        return repository.save(curso);
    }

    @Override
    public Curso buscar(Integer id) {
        Optional<Curso> optionalCurso = repository.findById(id);
        if(optionalCurso.isPresent()) {
            return optionalCurso.get();
        }
        return null;
    }

    @Override
    public void remover(Integer id) {
        Optional<Curso> curso = repository.findById(id);
        if(curso.isPresent()) {
            repository.delete(curso.get());
        }
    }

    @Override
    public List<Curso> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public List<Curso> buscarPorNome(String nome) {
        return repository.findByDescricaoContaining(nome);
    }
    
}
