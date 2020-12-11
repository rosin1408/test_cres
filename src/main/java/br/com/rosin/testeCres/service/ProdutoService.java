package br.com.rosin.testeCres.service;

import br.com.rosin.testeCres.model.Produto;
import br.com.rosin.testeCres.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public List<Produto> findAll() {
        return repository.findAll();
    }

    public Produto findProdutoByIdade(int idade) {
        return repository.findProdutoByIdade(idade);
    }
}
