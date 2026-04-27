package com.demo.Exercice3;

public class PizzaHutFactory implements PizzaFactory {
    private static PizzaHutFactory instance;

    private PizzaHutFactory() {}

    public static PizzaHutFactory getInstance() {
        if (instance == null) {
            instance = new PizzaHutFactory();
        }
        return instance;
    }

    @Override
    public Pizza creerMargherita() {
        return new Margherita();
    }

    @Override
    public Pizza creerFruttiDiMare() {
        return new FruttiDiMare();
    }
}
