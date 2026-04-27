package com.demo.Exercice6;

public class GoogleAdwords extends OptionDecorator {
    public GoogleAdwords(Offre offre) {
        super(offre);
    }

    @Override
    public double getCout() {
        return offre.getCout() + 14.99;
    }

    @Override
    public String getDescription() {
        return offre.getDescription() + " + Google Adwords (crédits publicité)";
    }
}
