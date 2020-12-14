package br.com.rosin.testeCres.service;

import br.com.rosin.testeCres.component.CriarSimulacao;
import br.com.rosin.testeCres.dto.NovaSimulacaoDto;
import br.com.rosin.testeCres.model.Simulacao;
import br.com.rosin.testeCres.repository.SimulacaoRepository;
import br.com.rosin.testeCres.validation.SimulacaoValidation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SimulacaoService {

    private final SimulacaoRepository repository;
    private final CriarSimulacao criarSimulacao;
    private final SimulacaoValidation validator;

    public Simulacao novo(NovaSimulacaoDto novaSimulacao) {
        validator.validar(novaSimulacao);
        final var simulacao = criarSimulacao.criar(novaSimulacao);

        return repository.save(simulacao);
    }

    public List<Simulacao> all() {
        return repository.findAll();
    }
}
