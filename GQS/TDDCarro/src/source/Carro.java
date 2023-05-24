package source;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Carro {

    private ArrayList<Roda> rodas;
    private Motor motor;
    private String marca;
    private String modelo;
    private int velocidade;

    public Carro(String marca, String modelo,
                 Motor motor, ArrayList<Roda> rodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.rodas = rodas;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public boolean equals(Object object) {
        Motor motor2 = (Motor) object;
        return motor2.imprimir().equals(this.motor.imprimir());
    }

    public ArrayList<Roda> getRodas() {
        return rodas;
    }

    public int acelerar() {
        if (velocidade < 360) {
            this.velocidade += 10;
        }
        return this.velocidade;
    }
    public int frear(){
        if(velocidade>0) {
            this.velocidade -= 10;
        }
        return this.velocidade;
    }
}
