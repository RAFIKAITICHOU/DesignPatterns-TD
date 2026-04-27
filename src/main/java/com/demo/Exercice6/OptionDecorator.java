package com.demo.Exercice6;

public abstract class OptionDecorator implements Offre {
    protected Offre offre;

    public OptionDecorator(Offre offre) {
        this.offre = offre;
    }

    @Override
    public abstract double getCout();

    @Override
    public abstract String getDescription();
}
