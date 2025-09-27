package com.biblioteca.livros.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "Livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titluo;

    private String autor;

    private String paginas;

    private String genero;

    public Livro() {}

    public Livro(String autor, String genero, Long id, String titulo, String paginas) {
        this.autor = autor;
        this.genero = genero;
        this.id = id;
        this.titluo = titulo;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitluo() {
        return titluo;
    }

    public void setTitluo(String titulo) {
        this.titluo = titulo;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }




}
