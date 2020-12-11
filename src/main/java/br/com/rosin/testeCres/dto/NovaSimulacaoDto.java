package br.com.rosin.testeCres.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class NovaSimulacaoDto {

    private String nomePessoa;
    private String cpf;
    private BigDecimal valorSegurado;
    private String numeroContratoEmprestimo;
    private LocalDate dataFim;
    private LocalDate dataNascimento;
}
