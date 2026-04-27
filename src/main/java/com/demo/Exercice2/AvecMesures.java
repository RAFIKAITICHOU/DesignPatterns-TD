package com.demo.Exercice2;

public class AvecMesures extends PlanDecorator {
    public AvecMesures(Plan plan) {
        super(plan);
    }

    @Override
    public String afficher() {
        return plan.afficher() + " + Mesures (dimensions meubles et pièce)";
    }
}
