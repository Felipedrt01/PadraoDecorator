package com.example.padraodecorator;

public class ArCondicionado extends CarroDecorator {

    public ArCondicionado(Carro carro) {
        super(carro);
    }

    @Override
    public float getPrecoOpcional() {
        return 2500.0f;
    }

    @Override
    public String getNomeOpcional() {
        return "Ar Condicionado";
    }
}

