package com.example.padraodecorator;

public class PinturaMetalica extends CarroDecorator {

    public PinturaMetalica(Carro carro) {
        super(carro);
    }

    @Override
    public float getPrecoOpcional() {
        return 2000.0f;
    }

    @Override
    public String getNomeOpcional() {
        return "Pintura Metálica";
    }
}
