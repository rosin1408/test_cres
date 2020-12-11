package br.com.rosin.testeCres.component;

import br.com.rosin.testeCres.dto.NovaSimulacaoDto;
import br.com.rosin.testeCres.model.Produto;
import br.com.rosin.testeCres.model.Simulacao;
import br.com.rosin.testeCres.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
@AllArgsConstructor
public class CriarSimulacao {

    final ProdutoService produtoService;

    public Simulacao criar(NovaSimulacaoDto novaSimulacao) {
        final var idade = definirIdade(novaSimulacao.getDataNascimento());
        final var produto = produtoService.findProdutoByIdade(idade);

        return Simulacao.builder().build();
    }

    private int definirIdade(LocalDate dataNascimento) {
        return Period.between(dataNascimento, LocalDate.now()).getDays();
    }
}
