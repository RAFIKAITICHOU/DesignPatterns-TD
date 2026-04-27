package com.demo.Exercice3;

public class Margherita implements Pizza {
    @Override
    public String getNom() {
        return "Margherita";
    }

    @Override
    public double getPrix() {
        return 3.00 + 1.50 + 2.00; // pâte + sauce + fromage
    }

    @Override
    public String getIngredients() {
        return "Pâte (3€), Sauce tomate (1.50€), Fromage (2€)";
    }
}
