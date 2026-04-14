package main.java.com.logistica.bridge;

public abstract class Frete {
    protected Transportador transportador;

    protected Frete(Transportador t) {
        this.transportador = t;
    }

    public abstract void processar();
}