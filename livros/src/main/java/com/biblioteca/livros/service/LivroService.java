package com.biblioteca.livros.service;

import com.biblioteca.livros.dto.LivroDTO;
import static com.biblioteca.livros.mapper.ObjectMapper.parseObject;
import static com.biblioteca.livros.mapper.ObjectMapper.parseListObjects;

import com.biblioteca.livros.entidade.Livro;
import com.biblioteca.livros.repository.LivroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public LivroDTO save(LivroDTO livroDTO) {
        repository.save(parseObject(livroDTO, Livro.class));
        return livroDTO;
    }

    public LivroDTO findById(Long id) {
        var livroEncontrado = repository.findById(id);
        return parseObject(livroEncontrado, LivroDTO.class);
    }

    public LivroDTO update(LivroDTO livroDTO) {
        var livroAtual = findById(livroDTO.getId());
        livroAtual.setAutor(livroDTO.getAutor());
        livroAtual.setGenero(livroDTO.getGenero());
        livroAtual.setPaginas(livroDTO.getPaginas());
        livroAtual.setTitulo(livroDTO.getTitulo());
        save(livroAtual);
        return livroAtual;
    }

    public void delete(Long id) {
        var livroEncontrado = findById(id);
        parseObject(livroEncontrado, Livro.class);
        repository.delete(parseObject(livroEncontrado, Livro.class));
    }

    public List<LivroDTO> findAll() {
        List<Livro> livros = repository.findAll();
        return parseListObjects(livros, LivroDTO.class);
    }


}
