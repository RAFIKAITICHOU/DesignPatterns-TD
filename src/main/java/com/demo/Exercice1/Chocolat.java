package com.demo.Exercice1;

public class Chocolat extends IngredientDecorator {
    public Chocolat(Dessert dessert) {
        super(dessert);
    }

    @Override
    public String getNom() {
        return dessert.getNom() + " + Chocolat";
    }

    @Override
    public double getPrix() {
        return dessert.getPrix() + 0.80;
    }
}
