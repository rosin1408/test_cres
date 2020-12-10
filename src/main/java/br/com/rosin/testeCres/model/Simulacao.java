package br.com.rosin.testeCres.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Simulacao {

    private Long id;
    private String nomePessoa;
    private String cpf;
    private BigDecimal valorSegurado;
    private String numeroContratoEmprestimo;
    private LocalDate fimContratoEmprestimo;
    private LocalDate dataNascimento;
    private Produto produtoEscolhido;
    private LocalDate dataSimulacao;
    private BigDecimal valorTotalPremio;
}
