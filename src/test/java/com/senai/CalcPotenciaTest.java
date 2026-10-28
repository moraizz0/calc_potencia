package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcPotenciaTest {

    @Test
    public void testCalcularPotencia() {

        CalcPotencia calc = new CalcPotencia();

        double resultado = calc.calcularPotencia(220, 5);

        assertEquals(1100.0, resultado);
    }
}

