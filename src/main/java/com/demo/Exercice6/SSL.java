package com.demo.Exercice6;

public class SSL extends OptionDecorator {
    public SSL(Offre offre) {
        super(offre);
    }

    @Override
    public double getCout() {
        return offre.getCout() + 4.99;
    }

    @Override
    public String getDescription() {
        return offre.getDescription() + " + SSL (certificat sécurité)";
    }
}
