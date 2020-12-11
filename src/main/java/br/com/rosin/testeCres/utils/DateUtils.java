package br.com.rosin.testeCres.utils;

import java.time.LocalDate;
import java.time.Period;

public class DateUtils {

    public static int calculaDiferencaMeses(LocalDate dataInicial, LocalDate dataFinal) {
        return Period.between(dataInicial, dataFinal).getMonths();
    }

    public static int calculaDiferencaAnos(LocalDate dataInicial, LocalDate dataFinal) {
        return Period.between(dataInicial, dataFinal).getYears();
    }
}
