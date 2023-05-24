package test;

import source.Motor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MotorTest {

    @Test
    void imprimir() {
        String valores = "Motor = torque: "+450.2+" litragem: "+52.3+" cilindros: "+2;
        Motor motor = new Motor(450.2,52.3,2);
        String valores2 = "Motor = torque: "+350.0+" litragem: "+42.5+" cilindros: "+8;
        Motor motor2 = new Motor(350, 42.5,8);
        assertTrue(valores.equals(motor.imprimir()));
        assertTrue(valores2.equals(motor2.imprimir()));
    }

    @Test
    void getTorque(){
        Motor vtec = new Motor(450.2,52.3,2);
        assertEquals(450.2, vtec.getTorque());
    }

    @Test
    void getCilindros(){
        Motor turbao = new Motor(350, 42.5,8);
        assertEquals(8, turbao.getCilindros());
    }

    @Test
    void getLitragem(){
        Motor turbo = new Motor(450.2,52.3, 6);
        assertEquals(52.3, turbo.getLitragem());
    }
    @Test
    void gets(){
        Motor motor = new Motor(250.2, 60.1, 4);
        assertEquals(250.2, motor.getTorque());
        assertEquals(60.1, motor.getLitragem());
        assertEquals(4, motor.getCilindros());
    }
    @Test
    void ligarDesligar() {
        Motor vtec = new Motor(450.2,52.3,4);
        assertTrue(vtec.ligarDesligar());
        assertTrue(!vtec.ligarDesligar());
    }
}