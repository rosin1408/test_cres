package br.com.rosin.testeCres.service;

import br.com.rosin.testeCres.component.CriarSimulacao;
import br.com.rosin.testeCres.dto.NovaSimulacaoDto;
import br.com.rosin.testeCres.model.Simulacao;
import br.com.rosin.testeCres.repository.SimulacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SimulacaoService {

    private final SimulacaoRepository repository;
    private final CriarSimulacao criarSimulacao;

    public Simulacao novo(NovaSimulacaoDto novaSimulacao) {
        System.out.println(novaSimulacao);
        criarSimulacao.criar(novaSimulacao);
        return Simulacao.builder().build();
    }
}
