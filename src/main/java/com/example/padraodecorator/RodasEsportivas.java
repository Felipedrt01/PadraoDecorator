package com.example.padraodecorator;

public class RodasEsportivas extends CarroDecorator {

    public RodasEsportivas(Carro carro) {
        super(carro);
    }

    @Override
    public float getPrecoOpcional() {
        return 3000.0f;
    }

    @Override
    public String getNomeOpcional() {
        return "Rodas Esportivas";
    }
}
