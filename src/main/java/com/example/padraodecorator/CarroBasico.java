package com.example.padraodecorator;

public class CarroBasico implements Carro {
    private float preco;

    public CarroBasico() {
    }

    public CarroBasico(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Carro Básico";
    }
}
