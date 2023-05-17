package source;

public class Calculadora {

    public double somar(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }

    public double subtrair(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;
    }

    public Double dividir(double numero1, double numero2) {
        if(numero2==0){
            return null;
        }
        return numero1/numero2;
    }

    public boolean isPositivo(double numero){
        return numero > 0;
    }

    public String concatenarString(String string1, String string2){
        return string1+" " +string2;
    }

}
