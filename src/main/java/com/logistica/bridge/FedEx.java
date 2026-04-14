package main.java.com.logistica.bridge;

public class FedEx implements Transportador {
    @Override
    public void entregar() {
        System.out.println("Enviando via FedEx.");
    }
}