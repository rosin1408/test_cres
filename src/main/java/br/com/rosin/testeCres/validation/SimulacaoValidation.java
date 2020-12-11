package br.com.rosin.testeCres.validation;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.rosin.testeCres.dto.NovaSimulacaoDto;
import br.com.rosin.testeCres.utils.DateUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SimulacaoValidation {

    public void validar(NovaSimulacaoDto novaSimulacao) {
        final var dataAtual = LocalDate.now();
        final var periodo = novaSimulacao.periodoEmMeses();

        if (periodo > 120) {
            throw new RuntimeException("Simulação deve conter no máximo 120 meses");
        }
        if (periodo < 1) {
            throw new RuntimeException("Simulação deve conter no mínimo 1 mês");
        }

        new CPFValidator().assertValid(novaSimulacao.getCpf());
    }
}
