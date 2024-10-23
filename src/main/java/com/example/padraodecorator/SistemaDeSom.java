package com.example.padraodecorator;

public class SistemaDeSom extends CarroDecorator {

    public SistemaDeSom(Carro carro) {
        super(carro);
    }

    @Override
    public float getPrecoOpcional() {
        return 1500.0f;
    }

    @Override
    public String getNomeOpcional() {
        return "Sistema de Som";
    }
}
