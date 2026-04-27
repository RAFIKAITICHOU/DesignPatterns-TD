package com.demo.Exercice3;

public class DominoFactory implements PizzaFactory {
    private static DominoFactory instance;

    private DominoFactory() {}

    public static DominoFactory getInstance() {
        if (instance == null) {
            instance = new DominoFactory();
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
