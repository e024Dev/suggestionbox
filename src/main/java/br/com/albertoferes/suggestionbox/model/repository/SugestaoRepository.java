package br.com.albertoferes.suggestionbox.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.albertoferes.suggestionbox.model.Sugestao;

@Repository
public interface SugestaoRepository  extends JpaRepository<Sugestao, Integer>{
    
}
