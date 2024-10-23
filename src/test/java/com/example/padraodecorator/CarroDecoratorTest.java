package com.example.padraodecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarroDecoratorTest {

    @Test
    public void testCarroBasico() {
        Carro carro = new CarroBasico(20000.0f);
        assertEquals(20000.0f, carro.getPreco(), "O preço do carro básico deve ser R$ 20.000,00");
        assertEquals("Carro Básico", carro.getDescricao(), "A descrição do carro deve ser 'Carro Básico'");
    }

    @Test
    public void testArCondicionado() {
        Carro carro = new CarroBasico(20000.0f);
        carro = new ArCondicionado(carro);
        assertEquals(22500.0f, carro.getPreco(), "O preço do carro com ar condicionado deve ser R$ 22.500,00");
        assertEquals("Carro Básico com Ar Condicionado", carro.getDescricao(), "A descrição deve incluir 'Ar Condicionado'");
    }

    @Test
    public void testSistemaDeSom() {
        Carro carro = new CarroBasico(20000.0f);
        carro = new SistemaDeSom(carro);
        assertEquals(21500.0f, carro.getPreco(), "O preço do carro com sistema de som deve ser R$ 21.500,00");
        assertEquals("Carro Básico com Sistema de Som", carro.getDescricao(), "A descrição deve incluir 'Sistema de Som'");
    }

    @Test
    public void testRodasEsportivas() {
        Carro carro = new CarroBasico(20000.0f);
        carro = new RodasEsportivas(carro);
        assertEquals(23000.0f, carro.getPreco(), "O preço do carro com rodas esportivas deve ser R$ 23.000,00");
        assertEquals("Carro Básico com Rodas Esportivas", carro.getDescricao(), "A descrição deve incluir 'Rodas Esportivas'");
    }

    @Test
    public void testPinturaMetalica() {
        Carro carro = new CarroBasico(20000.0f);
        carro = new PinturaMetalica(carro);
        assertEquals(22000.0f, carro.getPreco(), "O preço do carro com pintura metálica deve ser R$ 22.000,00");
        assertEquals("Carro Básico com Pintura Metálica", carro.getDescricao(), "A descrição deve incluir 'Pintura Metálica'");
    }

    @Test
    public void testCarroComTodosOsOpcionais() {
        Carro carro = new CarroBasico(20000.0f);
        carro = new ArCondicionado(carro);
        carro = new SistemaDeSom(carro);
        carro = new RodasEsportivas(carro);
        carro = new PinturaMetalica(carro);

        float precoEsperado = 20000.0f
                + 2500.0f // Ar Condicionado
                + 1500.0f // Sistema de Som
                + 3000.0f // Rodas Esportivas
                + 2000.0f; // Pintura Metálica

        assertEquals(precoEsperado, carro.getPreco(), "O preço do carro com todos os opcionais deve ser R$ " + precoEsperado);
        assertEquals("Carro Básico com Ar Condicionado com Sistema de Som com Rodas Esportivas com Pintura Metálica",
                carro.getDescricao(), "A descrição deve incluir todos os opcionais.");
    }
}
