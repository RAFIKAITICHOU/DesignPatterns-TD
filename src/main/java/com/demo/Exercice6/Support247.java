package com.demo.Exercice6;

public class Support247 extends OptionDecorator {
    public Support247(Offre offre) {
        super(offre);
    }

    @Override
    public double getCout() {
        return offre.getCout() + 9.99;
    }

    @Override
    public String getDescription() {
        return offre.getDescription() + " + Support 24/24 7/7";
    }
}
