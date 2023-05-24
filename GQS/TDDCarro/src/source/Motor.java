package source;

public class Motor {
    private  int cilindros;
    private boolean ligado;
    private double torque;
    private double litragem;

    public Motor(double torque, double litragem, int cilindros) {
        this.torque = torque;
        this.litragem = litragem;
        this.cilindros = cilindros;
    }

    public String imprimir() {
        return "Motor = torque: "+this.torque+" litragem: "+this.litragem+
                " cilindros: "+this.cilindros;
    }

    public double getTorque() {
        return this.torque;
    }

    public double getLitragem(){
        return this.litragem;
    }

    public int getCilindros(){
        return this.cilindros;
    }
    public boolean ligarDesligar() {
        ligado = !ligado;
        return ligado;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindros=" + cilindros +
                ", ligado=" + ligado +
                ", torque=" + torque +
                ", litragem=" + litragem +
                '}';
    }
}
