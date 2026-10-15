
package br.com.senai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcIMCTest {

    @Test
    public void deveCalcularIMC() {
        CalcIMC calculadora = new CalcIMC();

        double resultado = calculadora.calcularIMC(60, 1.70);

        assertEquals(20.76, resultado, 0.01);
    }
}
