
package br.com.senai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcPotenciaTest {

    @Test
    public void deveCalcularPotencia() {
        CalcPotencia calculadora = new CalcPotencia();

        double resultado = calculadora.calcularPotencia(220, 5);

        assertEquals(1100.0, resultado, 0.01);
    }
}
