package teste;

import org.junit.jupiter.api.Test;
import source.Dolar;

import static org.junit.jupiter.api.Assertions.*;

class DolarTest {
    @Test
    public void  testMultiplicacao() {
        /*Dolar dolar1 = new Dolar(5);
        dolar1.multiplicar(2);
        assertEquals(10, dolar1.quantidade);
        dolar2 = dolar1.multiplicar(3);
        assertEquals(new Dolar(15), dolar2);*/
        Dolar dolar1 = new Dolar(5);
        assertTrue(new Dolar(10).equals(dolar1.multiplicar(2)));
        assertTrue(new Dolar(15).equals(dolar1.multiplicar(3)));
    }
}