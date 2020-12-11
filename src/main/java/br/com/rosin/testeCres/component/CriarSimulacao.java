package br.com.rosin.testeCres.component;

import br.com.rosin.testeCres.dto.NovaSimulacaoDto;
import br.com.rosin.testeCres.model.Produto;
import br.com.rosin.testeCres.model.Simulacao;
import br.com.rosin.testeCres.service.ProdutoService;
import br.com.rosin.testeCres.utils.DateUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

@Component
@AllArgsConstructor
public class CriarSimulacao {

    final ProdutoService produtoService;

    public Simulacao criar(NovaSimulacaoDto novaSimulacao) {
        final var dataAtual = LocalDate.now();
        final var idade = definirIdade(novaSimulacao.getDataNascimento(), dataAtual);
        final var produto = produtoService.findProdutoByIdade(idade);

        if (produto == null) {
            throw new RuntimeException("Não foi encontrado um produto compatível com a idade do segurado");
        }
        return Simulacao.builder()
                .nomePessoa(novaSimulacao.getNomePessoa())
                .cpf(novaSimulacao.getCpf())
                .dataSimulacao(dataAtual)
                .valorSegurado(novaSimulacao.getValorSegurado())
                .numeroContratoEmprestimo(novaSimulacao.getNumeroContratoEmprestimo())
                .dataNascimento(novaSimulacao.getDataNascimento())
                .dataSimulacao(dataAtual)
                .fimContratoEmprestimo(novaSimulacao.getDataFim())
                .produtoEscolhido(produto)
                .valorTotalPremio(calculaValorTotalPremio(produto, novaSimulacao, dataAtual))
                .build();
    }

    private BigDecimal calculaValorTotalPremio(Produto produto, NovaSimulacaoDto novaSimulacao, LocalDate dataAtual) {
        final var taxaJuros = produto.getTaxaJuros();
        final var valorSegurado = novaSimulacao.getValorSegurado();
        final var numeroMeses = calcularNumeroMeses(novaSimulacao.getDataFim(), dataAtual);

        return valorSegurado.multiply(taxaJuros.divide(new BigDecimal(1000))).multiply(new BigDecimal(numeroMeses));
    }

    private int definirIdade(LocalDate dataNascimento, LocalDate dataAtual) {
        return DateUtils.calculaDiferencaAnos(dataNascimento, dataAtual);
    }

    private int calcularNumeroMeses(LocalDate dataFinal, LocalDate dataAtual) {
        return DateUtils.calculaDiferencaMeses(dataAtual, dataFinal);
    }
}
