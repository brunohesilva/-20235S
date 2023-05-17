package source;

public class Motor {
    private boolean ligado;
    private double torque;
    private double litragem;
    private int cilindros;
    public Motor(double torque, double litragem, int cilindros){
        this.torque = torque;
        this.litragem = litragem;
        this.cilindros = cilindros;
    }
    public String imprimir(){
        return "Motor = torque: "+this.torque+" litragem: "+this.litragem+" cilindros: "+this.cilindros;
    }
    public double getTorque() {
        return this.torque;
    }

    public double getLitragem() {
        return this.litragem;
    }

    public int getCilindros() {
        return this.cilindros;
    }
    public boolean ligarDesligar() {
        ligado = !ligado;
        return ligado;
    }
}
