package br.com.albertoferes.suggestionbox.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.albertoferes.suggestionbox.model.TipoSugestao;
import br.com.albertoferes.suggestionbox.model.repository.TipoSugestaoRepository;

@Service
public class TipoSugestaoService {

    @Autowired
    private TipoSugestaoRepository repository;
    
    public List<TipoSugestao> buscar() {
        List<TipoSugestao> sugestoes = new ArrayList<>();
        sugestoes = repository.findAll();

        return sugestoes;
    }

    public void inserir(TipoSugestao tipoSugestao) {
        repository.save(tipoSugestao);
    }

    public void inserir(List<TipoSugestao> listTipoSugestao) {
        repository.saveAll(listTipoSugestao);
    }
}
