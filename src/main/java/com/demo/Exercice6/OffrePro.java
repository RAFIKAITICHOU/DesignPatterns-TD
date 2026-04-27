package com.demo.Exercice6;

public class OffrePro implements Offre {
    @Override
    public double getCout() {
        return 19.99;
    }

    @Override
    public String getDescription() {
        return "Offre Pro (hébergement professionnel)";
    }
}
