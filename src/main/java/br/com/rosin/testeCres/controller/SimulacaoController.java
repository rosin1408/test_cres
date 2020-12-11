package br.com.rosin.testeCres.controller;

import br.com.rosin.testeCres.model.Simulacao;
import br.com.rosin.testeCres.service.SimulacaoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/simulacao")
@AllArgsConstructor
public class SimulacaoController {

    private final SimulacaoService service;

    @GetMapping("/")
    public List<Simulacao> all() {
        return List.of();
    }

    @GetMapping("/{id}")
    public Simulacao findById(@PathVariable Long id) {
        return Simulacao.builder().build();
    }
}
