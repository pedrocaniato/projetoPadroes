package main.java.com.logistica.bridge;

public class DHL implements Transportador {
    @Override
    public void entregar() {
        System.out.println("Enviando via DHL.");
    }
}