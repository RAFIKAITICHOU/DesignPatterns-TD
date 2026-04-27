package com.demo.Exercice2;

public class AvecDevis extends PlanDecorator {
    public AvecDevis(Plan plan) {
        super(plan);
    }

    @Override
    public String afficher() {
        return plan.afficher() + " + Devis détaillé";
    }
}