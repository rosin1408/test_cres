package br.com.rosin.testeCres;

import br.com.rosin.testeCres.model.Produto;
import br.com.rosin.testeCres.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DataLoader {

    private final ProdutoRepository produtoRepository;

    @Autowired
    private DataLoader(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;

        loadProdutos();
    }

    private void loadProdutos() {
        produtoRepository.save(Produto.builder()
                .nome("Produto 1")
                .idadeMinima(18)
                .idadeMaxima(70)
                .taxaJuros(new BigDecimal("0.4500"))
                .valorMinimoPremio(new BigDecimal(5))
                .build());
        produtoRepository.save(Produto.builder()
                .nome("Produto 2")
                .idadeMinima(71)
                .idadeMaxima(75)
                .taxaJuros(new BigDecimal("1.8472"))
                .valorMinimoPremio(new BigDecimal(5))
                .build());
    }
}
