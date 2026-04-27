package com.demo.Exercice3;

public class FruttiDiMare implements Pizza {
    @Override
    public String getNom() {
        return "Frutti di Mare";
    }

    @Override
    public double getPrix() {
        return 3.00 + 1.50 + 2.00 + 2.50; // pâte + sauce + fromage + fruits de mer
    }

    @Override
    public String getIngredients() {
        return "Pâte (3€), Sauce tomate (1.50€), Fromage (2€), Fruits de mer (2.50€)";
    }
}