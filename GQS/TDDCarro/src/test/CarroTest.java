package test;

import source.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class CarroTest {
    Carro relampago;
    Motor motor;
    ArrayList<Roda> rodas = new ArrayList<Roda>(5);

    public CarroTest() {
        motor = new Motor(450.2, 52.3, 2);
        Roda roda1 = new Roda(15, "Pirelli", 26.3);
        Roda roda2 = new Roda(15, "Bridgestone", 35.8);
        Roda roda3 = new Roda(15, "Continental", 27.2);
        Roda roda4 = new Roda(15, "Goodyear", 30);
        rodas.add(roda1);
        rodas.add(roda2);
        rodas.add(roda3);
        rodas.add(roda4);
        relampago = new Carro("Chevrolet", "Corvette",
                motor, rodas);
    }

    @Test
    void getMarca() {
        assertEquals("Chevrolet",
                relampago.getMarca());
    }

    @Test
    void getModelo() {
        assertEquals("Corvette",
                relampago.getModelo());
    }

    @Test
    void getMotor() {
        assertEquals(relampago.getMotor(), motor);
    }

    @Test
    void getRodas() {
        assertEquals(relampago.getRodas(), rodas);
    }

    @Test
    void acelerar() {
        assertEquals(10, relampago.acelerar());
        assertEquals(20, relampago.acelerar());
        for (int i = 0; i < 40; i++) {
            relampago.acelerar();
        }
        assertEquals(360, relampago.acelerar());
    }

    @Test
    void frear() {
        assertEquals(0, relampago.frear());
        for (int i = 0; i < 10; i++) {
            relampago.acelerar();
        }
        assertEquals(90, relampago.frear());
    }
}