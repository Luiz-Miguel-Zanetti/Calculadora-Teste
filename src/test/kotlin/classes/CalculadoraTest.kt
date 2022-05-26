package classes

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestTemplate

internal class CalculadoraTest{


    @Test
    fun somaTeste(){



       assertEquals(10.0, Calculadora.soma(5.0, 5.0))

    }

    @Test
    fun subtraçãoTeste(){

        assertEquals(15.0, Calculadora.subtração(20.0, 5.0))

    }


    @Test
    fun multiplicaçãoTeste(){

        assertEquals(16.0, Calculadora.multiplicação(4.0, 4.0))

    }

    @Test
    fun divisãoTeste(){

        assertEquals(100.0, Calculadora.divisão(1000.0, 10.0))

    }

   @Test
    fun raizTeste(){

        assertEquals(5.0, Calculadora.raiz(25.0))

    }

    @Test
    fun potenciaTeste(){

        assertEquals(1600.0, Calculadora.potencia(40.0, 2.0))

    }

}



