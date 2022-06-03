package br.com.albertoferes.suggestionbox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.albertoferes.suggestionbox.model.Sugestao;
import br.com.albertoferes.suggestionbox.model.repository.SugestaoRepository;

@Service
public class SugestaoService {

    @Autowired
    private SugestaoRepository repository;

    public void inserir(Sugestao sugestao) {
        repository.save(sugestao);
    }
    
}
