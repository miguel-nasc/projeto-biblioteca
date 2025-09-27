package com.biblioteca.livros.controller;

import com.biblioteca.livros.dto.LivroDTO;
import com.biblioteca.livros.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping("/{id}")
    public LivroDTO id(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping()
    public LivroDTO save(@RequestBody @Valid LivroDTO livroDTO) {
        return service.save(livroDTO);
    }

    @PutMapping()
    public LivroDTO update(@RequestBody @Valid LivroDTO livroDTO){
        return service.update(livroDTO);
    }

    @GetMapping("/all")
    public List<LivroDTO> all(){
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

}
