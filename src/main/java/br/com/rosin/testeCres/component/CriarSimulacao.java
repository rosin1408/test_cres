package br.com.rosin.testeCres.component;

import br.com.rosin.testeCres.dto.NovaSimulacaoDto;
import br.com.rosin.testeCres.model.Simulacao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CriarSimulacao {

    public Simulacao criar(NovaSimulacaoDto novaSimulacao) {
        return Simulacao.builder().build();
    }
}
