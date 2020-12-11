package br.com.rosin.testeCres.dto;

import br.com.rosin.testeCres.utils.DateUtils;
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

    public int idade() {
        return DateUtils.calculaDiferencaAnos(dataNascimento, LocalDate.now());
    }

    public int periodoEmMeses() {
        return DateUtils.calculaDiferencaMeses(LocalDate.now(), this.dataFim);
    }
}
