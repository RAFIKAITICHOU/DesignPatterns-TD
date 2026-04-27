package com.demo.Exercice6;

public class OffrePerso implements Offre {
    @Override
    public double getCout() {
        return 9.99;
    }

    @Override
    public String getDescription() {
        return "Offre Perso (hébergement de base)";
    }
}
