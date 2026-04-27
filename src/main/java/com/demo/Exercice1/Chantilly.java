package com.demo.Exercice1;

public class Chantilly extends IngredientDecorator {
    public Chantilly(Dessert dessert) {
        super(dessert);
    }

    @Override
    public String getNom() {
        return dessert.getNom() + " + Chantilly";
    }

    @Override
    public double getPrix() {
        return dessert.getPrix() + 0.60;
    }
}
