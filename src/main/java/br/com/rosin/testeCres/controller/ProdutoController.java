package br.com.rosin.testeCres.controller;

import br.com.rosin.testeCres.model.Produto;
import br.com.rosin.testeCres.model.Simulacao;
import br.com.rosin.testeCres.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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
        return List.of();
    }

    @GetMapping("/#{id}")
    public Produto findById(Long id) {
        return Produto.builder().build();
    }
}
