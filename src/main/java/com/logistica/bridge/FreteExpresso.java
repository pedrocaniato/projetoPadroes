package main.java.com.logistica.bridge;

public class FreteExpresso extends Frete {
    public FreteExpresso(Transportador t) {
        super(t);
    }

    @Override
    public void processar() {
        System.out.print("Frete Prioritário: ");
        transportador.entregar();
    }
}