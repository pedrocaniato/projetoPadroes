package main.java.com.logistica.factorymethod;

public class Caminhao implements Veiculo {
    @Override
    public void mover() {
        System.out.println("Caminhão rodando na estrada.");
    }
}