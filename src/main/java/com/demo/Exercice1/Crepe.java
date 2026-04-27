package com.demo.Exercice1;

public class Crepe implements Dessert {
    @Override
    public String getNom() {
        return "Crêpe";
    }

    @Override
    public double getPrix() {
        return 2.50;
    }
}