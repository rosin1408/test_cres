package br.com.rosin.testecres.utils;

import br.com.rosin.testeCres.utils.DateUtils;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateUtilsTest {

    @Test
    public void deveCalcularDiferencaDeMesesQuandoMesesNoMesmoAno() {
        final var diferencaMeses = DateUtils.calculaDiferencaMeses(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31));
        assertEquals(11, diferencaMeses);
    }

    @Test
    public void deveCalcularDiferencaDeMesesQuandoDiferencaMaiorQueUmAno() {
        final var diferencaMeses = DateUtils.calculaDiferencaMeses(LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31));
        assertEquals(23, diferencaMeses);
    }

}
