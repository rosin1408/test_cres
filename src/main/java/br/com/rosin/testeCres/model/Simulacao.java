package br.com.rosin.testeCres.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Simulacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePessoa;
    private String cpf;
    private BigDecimal valorSegurado;
    private String numeroContratoEmprestimo;
    private LocalDate fimContratoEmprestimo;
    private LocalDate dataNascimento;
    @ManyToOne
    @JoinColumn(name = "produtoescolhidoid", referencedColumnName = "id")
    private Produto produtoEscolhido;
    private LocalDate dataSimulacao;
    private BigDecimal valorTotalPremio;
}

