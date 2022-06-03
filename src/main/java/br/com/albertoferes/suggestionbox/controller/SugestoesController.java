package br.com.albertoferes.suggestionbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.albertoferes.suggestionbox.model.TipoSugestao;
import br.com.albertoferes.suggestionbox.service.TipoSugestaoService;

@Controller
public class SugestoesController {


    @Autowired
    private TipoSugestaoService service;
    
    @GetMapping("/sugestoes")
    public String getSugestoes(Model model) {

        List<TipoSugestao> sugestoes = service.buscar();
        model.addAttribute("sugestoes", sugestoes);
        return "sugestoes";
    }

}
