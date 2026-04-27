package com.demo.Exercice6;

public class Sauvegardes extends OptionDecorator {
    public Sauvegardes(Offre offre) {
        super(offre);
    }

    @Override
    public double getCout() {
        return offre.getCout() + 5.99;
    }

    @Override
    public String getDescription() {
        return offre.getDescription() + " + Sauvegardes automatiques";
    }
}
