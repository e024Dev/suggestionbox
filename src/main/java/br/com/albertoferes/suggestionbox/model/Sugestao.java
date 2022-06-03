package br.com.albertoferes.suggestionbox.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sugestao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;
    private LocalDate data;
    private String nomeAutor;

    @ManyToOne
    @JoinColumn(name = "id_tiposugestao")
    private TipoSugestao tipo;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public Sugestao() {
    }

    public Sugestao(String descricao, LocalDate data, String nomeAutor, TipoSugestao tipo, Curso curso) {
        this.descricao = descricao;
        this.data = data;
        this.nomeAutor = nomeAutor;
        this.tipo = tipo;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public TipoSugestao getTipo() {
        return tipo;
    }

    public void setTipo(TipoSugestao tipo) {
        this.tipo = tipo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Sugestao [curso=" + curso + ", data=" + data + ", descricao=" + descricao + ", id=" + id
                + ", nomeAutor=" + nomeAutor + ", tipo=" + tipo + "]";
    }
}
