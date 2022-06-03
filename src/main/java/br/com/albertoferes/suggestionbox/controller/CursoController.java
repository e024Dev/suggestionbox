package br.com.albertoferes.suggestionbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.albertoferes.suggestionbox.model.Curso;
import br.com.albertoferes.suggestionbox.service.CursoService;

@Controller
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService service;
    
    @GetMapping("/cadastrar")
    public String curso(Curso curso) {
        return "curso/cadastrar";
    }

    @PostMapping("/salvar")
    public String salvar(Curso curso) {
        Curso obj = service.salvar(curso);
        System.out.println(obj);
        return "redirect:cadastrar";
    }
}
