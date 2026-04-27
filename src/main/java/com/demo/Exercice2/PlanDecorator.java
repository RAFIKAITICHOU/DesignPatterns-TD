package com.demo.Exercice2;

public abstract class PlanDecorator implements Plan {
    protected Plan plan;

    public PlanDecorator(Plan plan) {
        this.plan = plan;
    }

    @Override
    public abstract String afficher();
}
