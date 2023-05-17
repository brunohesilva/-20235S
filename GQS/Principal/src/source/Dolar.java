package source;

public class Dolar {
    public int quantidade;

    public Dolar(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return this.quantidade;
    }

    public Dolar multiplicar(int multiplica) {
        return new Dolar(quantidade* multiplica);
    }

    @Override
    public boolean equals(Object objeto){
        Dolar dolar = (Dolar) objeto;
        return quantidade == dolar.quantidade;
    }
}
