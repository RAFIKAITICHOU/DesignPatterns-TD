package com.demo.Exercice2;

public class PlanDeBase implements Plan {
    private String description;

    public PlanDeBase() {
        this.description = "Plan de base avec emplacement des meubles";
    }

    @Override
    public String afficher() {
        return description;
    }
}
