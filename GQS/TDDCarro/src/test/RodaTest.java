package test;
import source.Roda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RodaTest {
    @Test
    void getAro() {
        Roda roda1 = new Roda(17,"rotiform",22.3);
        assertEquals(17, roda1.getAro());
    }
    @Test
    void getMarca(){
        Roda roda1 = new Roda(17,"rotiform",22.3);
        assertEquals("rotiform",roda1.getMarca());
    }
    @Test
    void getLargura(){
        Roda roda1 = new Roda(17,"rotiform", 22.3);
        assertEquals(22.3, roda1.getLargura());
    }
    @Test
    void gets(){
        Roda roda1 = new Roda(15,"michelin",19.4);
        assertEquals(15, roda1.getAro());
        assertEquals("michelin",roda1.getMarca());
        assertEquals(19.4, roda1.getLargura());
    }
    @Test
    void encher(){
        Roda roda1 = new Roda(15,"michelin",19.4);
        assertTrue(roda1.encher());
    }
    @Test void imprimir(){
        Roda roda1 = new Roda(15,"michelin",19.4);
        Roda roda2 = new Roda(17,"rotiform", 22.3);
        String exemplo = "Roda = aro: "+15+" marca: michelin largura: "+19.4;
        String exemplo2 = "Roda = aro: "+17+" marca: rotiform largura: "+22.3;
        assertEquals(exemplo, roda1.imprimir());
        assertEquals(exemplo2, roda2.imprimir());
    }
}