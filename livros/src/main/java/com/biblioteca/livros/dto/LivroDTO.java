package com.biblioteca.livros.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

public class LivroDTO {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;
    @NotBlank
    private String titulo;
    @NotBlank
    private String autor;
    @NotBlank
    private String paginas;
    @NotBlank
    private String genero;

    public LivroDTO() {
    }

    public LivroDTO(String autor, String genero, String paginas, String titulo) {
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
        this.titulo = titulo;
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

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LivroDTO livroDTO)) return false;
        return Objects.equals(getTitulo(), livroDTO.getTitulo()) && Objects.equals(getAutor(), livroDTO.getAutor()) && Objects.equals(getPaginas(), livroDTO.getPaginas()) && Objects.equals(getGenero(), livroDTO.getGenero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getAutor(), getPaginas(), getGenero());
    }
}
