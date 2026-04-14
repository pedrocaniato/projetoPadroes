package main.java.com.logistica.factorymethod;

public class LogisticaTerrestre extends Logistica {
    @Override
    public Veiculo criarTransporte() {
        return new Caminhao();
    }
}