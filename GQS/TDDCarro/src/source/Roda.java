package source;

public class Roda {
    private double largura;
    private String marca;
    private int aro;
    private boolean cheio;

    public Roda(int aro, String marca, double largura) {
        this.aro = aro;
        this.marca= marca;
        this.largura = largura;
    }

    public int getAro() {
        return aro;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getLargura() {
        return largura;
    }
    public boolean encher(){
        this.cheio = true;
        return cheio;
    }
    public String imprimir(){
        return "Roda = aro: "+aro+" marca: "+marca+" largura: "+largura;
    }
}
