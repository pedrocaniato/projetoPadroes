package main.java.com.logistica.abstractfactory;

public interface VeiculoFactory {
    Motor criarMotor();
    Pneu criarPneu();
}