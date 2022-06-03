package br.com.albertoferes.suggestionbox.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.albertoferes.suggestionbox.model.TipoSugestao;

@Repository
public interface TipoSugestaoRepository extends JpaRepository<TipoSugestao, Integer>{

}
