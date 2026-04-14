package main.java.com.logistica;

// Importando os pacotes que você criou
import main.java.com.logistica.singleton.Database;
import main.java.com.logistica.bridge.*;
import main.java.com.logistica.factorymethod.*;
import main.java.com.logistica.abstractfactory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. SINGLETON ---");
        Database db = Database.getInstance();
        db.query("SELECT * FROM entregas");

        System.out.println("\n--- 2. BRIDGE ---");
        // Usando as classes do pacote bridge
        Transportador dhl = new DHL();
        Frete frete = new FreteExpresso(dhl);
        frete.processar();

        System.out.println("\n--- 3. FACTORY METHOD ---");
        // Usando as classes do pacote factorymethod
        Logistica log = new LogisticaTerrestre();
        Veiculo v = log.criarTransporte();
        v.mover();

        System.out.println("\n--- 4. ABSTRACT FACTORY ---");
        // Usando as classes do pacote abstractfactory
        VeiculoFactory factory = new CaminhaoFactory();
        factory.criarMotor().ligar();
        factory.criarPneu().calibrar();
    }
}