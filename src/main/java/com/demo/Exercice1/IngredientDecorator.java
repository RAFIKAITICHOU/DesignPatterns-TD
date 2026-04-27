package com.demo.Exercice1;

public abstract class IngredientDecorator implements Dessert {
    protected Dessert dessert;

    public IngredientDecorator(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public abstract String getNom();

    @Override
    public abstract double getPrix();
}
