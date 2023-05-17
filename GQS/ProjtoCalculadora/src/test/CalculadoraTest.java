package test;

import org.junit.jupiter.api.Test;
import source.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora;

    public CalculadoraTest() {
        this.calculadora = new Calculadora();
    }

    @Test void testSomar(){

        assertEquals(15.4, calculadora.somar(12.1,3.3), 0.000001);
        assertEquals(9, calculadora.somar(5,4));
        assertEquals(17.1, calculadora.somar(10.05,7.05), 0.000001);
        assertEquals(0, calculadora.somar(0,0));
        assertEquals(78, calculadora.somar(53,25));
        assertEquals(25, calculadora.somar(17,8));
        assertEquals(25, calculadora.somar(150,-125));
        assertEquals(4, calculadora.somar(2,2));

    }

    @Test void testSubtrair(){

        assertEquals(8.8, calculadora.subtrair(12.1,3.3), 0.000001);
        assertEquals(1, calculadora.subtrair(5,4));
        assertEquals(3, calculadora.subtrair(10.05,7.05), 0.000001);
        assertEquals(0, calculadora.subtrair(0,0));
        assertEquals(28, calculadora.subtrair(53,25));
        assertEquals(9, calculadora.subtrair(17,8));
        assertEquals(25, calculadora.subtrair(150,125));
        assertEquals(0, calculadora.subtrair(2,2));
        assertEquals(25, calculadora.subtrair(20,-5));
        assertEquals(-15, calculadora.subtrair(-20,-5));

    }

    @Test void TestDividir(){

        assertEquals(3, calculadora.dividir(15,5));
        assertEquals(2.1, calculadora.dividir(10.5,5));
        assertEquals(6, calculadora.dividir(120,20));
        assertEquals(3.6666666, calculadora.dividir(12.1,3.3), 0.00001);
        assertEquals(4, calculadora.dividir(8,2));
        assertEquals(null, calculadora.dividir(20,0));
        assertEquals(4, calculadora.dividir(-20,-5));

    }

    @Test void testPositivo(){

        assertTrue(calculadora.isPositivo(10));
        assertFalse(calculadora.isPositivo(0));
        assertFalse(calculadora.isPositivo(-100));

    }

    @Test void testConcatenarString(){
        assertEquals("Bruno Henrique", calculadora.concatenarString("Bruno", "Henrique"));
    }

}