package com.example.padraodecorator;

public abstract class CarroDecorator implements Carro {
    private Carro carro;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract float getPrecoOpcional();

    @Override
    public float getPreco() {
        return this.carro.getPreco() + this.getPrecoOpcional();
    }

    public abstract String getNomeOpcional();

    @Override
    public String getDescricao() {
        return this.carro.getDescricao() + " com " + this.getNomeOpcional();
    }
}
