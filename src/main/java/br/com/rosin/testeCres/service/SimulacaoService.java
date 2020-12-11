package br.com.rosin.testeCres.service;

import br.com.rosin.testeCres.repository.SimulacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SimulacaoService {

    private final SimulacaoRepository repository;
}
