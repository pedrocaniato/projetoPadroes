package main.java.com.logistica.factorymethod;

public abstract class Logistica {
    // Esse é o Factory Method
    public abstract Veiculo criarTransporte(); 

    public void organizarEntrega() {
        Veiculo v = criarTransporte();
        v.mover();
    }
}