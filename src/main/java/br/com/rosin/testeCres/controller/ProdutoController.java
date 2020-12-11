package br.com.rosin.testeCres.controller;

import br.com.rosin.testeCres.model.Produto;
import br.com.rosin.testeCres.model.Simulacao;
import br.com.rosin.testeCres.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoService service;

    @GetMapping("/")
    public List<Produto> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable Long id) {
        return Produto.builder().build();
    }
}
