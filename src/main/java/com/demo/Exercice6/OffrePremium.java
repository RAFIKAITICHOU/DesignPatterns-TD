package com.demo.Exercice6;

public class OffrePremium implements Offre {
    @Override
    public double getCout() {
        return 29.99;
    }

    @Override
    public String getDescription() {
        return "Offre Premium (hébergement haute performance)";
    }
}
