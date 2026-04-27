package com.demo.Exercice6;

public class MySQL extends OptionDecorator {
    public MySQL(Offre offre) {
        super(offre);
    }

    @Override
    public double getCout() {
        return offre.getCout() + 2.99;
    }

    @Override
    public String getDescription() {
        return offre.getDescription() + " + Base de données MySQL";
    }
}
