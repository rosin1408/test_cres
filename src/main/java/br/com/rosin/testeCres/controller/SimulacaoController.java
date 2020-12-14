package br.com.rosin.testeCres.controller;

import br.com.rosin.testeCres.dto.NovaSimulacaoDto;
import br.com.rosin.testeCres.model.Simulacao;
import br.com.rosin.testeCres.service.SimulacaoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simulacao")
@AllArgsConstructor
public class SimulacaoController {

    private final SimulacaoService service;

    @GetMapping("/")
    public List<Simulacao> all() {
        return service.all();
    }

    @GetMapping("/{id}")
    public Simulacao findById(@PathVariable Long id) {
        return Simulacao.builder().build();
    }

    @PostMapping("/")
    public Simulacao novo(@RequestBody NovaSimulacaoDto novaSimulacao) {
        return service.novo(novaSimulacao);
    }
}
