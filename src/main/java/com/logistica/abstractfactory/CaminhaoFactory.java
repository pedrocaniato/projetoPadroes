package main.java.com.logistica.abstractfactory;

public class CaminhaoFactory implements VeiculoFactory {
    @Override
    public Motor criarMotor() {
        return () -> System.out.println("Motor Diesel ligado.");
    }

    @Override
    public Pneu criarPneu() {
        return () -> System.out.println("Pneu de carga calibrado.");
    }
}