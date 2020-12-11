package br.com.rosin.testeCres.service;

import br.com.rosin.testeCres.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;
}
