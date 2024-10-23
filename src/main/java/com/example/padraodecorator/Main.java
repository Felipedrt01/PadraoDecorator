package com.example.padraodecorator;

public class Main {
    public static void main(String[] args) {
        // Criar um carro básico
        Carro carroBasico = new CarroBasico(20000.0f);

        // Exibir informações do carro básico
        System.out.println("Carro: " + carroBasico.getDescricao());
        System.out.println("Preço: R$ " + carroBasico.getPreco());

        // Adicionar ar condicionado
        carroBasico = new ArCondicionado(carroBasico);
        System.out.println("\nApós adicionar o Ar Condicionado:");
        System.out.println("Carro: " + carroBasico.getDescricao());
        System.out.println("Preço: R$ " + carroBasico.getPreco());

        // Adicionar sistema de som
        carroBasico = new SistemaDeSom(carroBasico);
        System.out.println("\nApós adicionar o Sistema de Som:");
        System.out.println("Carro: " + carroBasico.getDescricao());
        System.out.println("Preço: R$ " + carroBasico.getPreco());

        // Adicionar rodas esportivas
        carroBasico = new RodasEsportivas(carroBasico);
        System.out.println("\nApós adicionar as Rodas Esportivas:");
        System.out.println("Carro: " + carroBasico.getDescricao());
        System.out.println("Preço: R$ " + carroBasico.getPreco());

        // Adicionar pintura metálica
        carroBasico = new PinturaMetalica(carroBasico);
        System.out.println("\nApós adicionar a Pintura Metálica:");
        System.out.println("Carro: " + carroBasico.getDescricao());
        System.out.println("Preço: R$ " + carroBasico.getPreco());
    }
}
