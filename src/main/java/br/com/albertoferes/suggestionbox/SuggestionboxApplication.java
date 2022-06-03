package br.com.albertoferes.suggestionbox;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.albertoferes.suggestionbox.model.Curso;
import br.com.albertoferes.suggestionbox.model.Sugestao;
import br.com.albertoferes.suggestionbox.model.TipoSugestao;
import br.com.albertoferes.suggestionbox.model.repository.CursoRepository;
import br.com.albertoferes.suggestionbox.model.repository.TipoSugestaoRepository;
import br.com.albertoferes.suggestionbox.service.SugestaoService;
import br.com.albertoferes.suggestionbox.service.TipoSugestaoService;

@SpringBootApplication
public class SuggestionboxApplication implements CommandLineRunner {

	@Autowired
	private TipoSugestaoService tipoSugestaoService;
	@Autowired 
	private SugestaoService sugestaoService;
	@Autowired
	private CursoRepository cursoRepository;


	public static void main(String[] args) {
		SpringApplication.run(SuggestionboxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		var sugestao = new TipoSugestao("Susgestão");
		var comentario = new TipoSugestao("Comentário");
		var reclamacao = new TipoSugestao("Reclamação");
		var elogio = new TipoSugestao("Elogio");

		tipoSugestaoService.inserir(List.of(sugestao, comentario, reclamacao, elogio));

		tipoSugestaoService.inserir(new TipoSugestao("Teste"));

		Curso ds = new Curso("Desenvolvimento de Sistemas");

		Curso saved = cursoRepository.save(ds);

		Sugestao sugestao2 = new Sugestao("Sexta-feira da Pizza", LocalDate.now(), "Hettory", sugestao, saved);
		
		sugestaoService.inserir(sugestao2);
	}

}
