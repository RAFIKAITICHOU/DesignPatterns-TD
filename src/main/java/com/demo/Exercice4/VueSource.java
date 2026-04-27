package com.demo.Exercice4;

public class VueSource implements Observateur {
    private String nom;

    public VueSource(String nom) {
        this.nom = nom;
    }

    @Override
    public void actualiser(String contenu) {
        System.out.println("[" + nom + " - Vue Code Source] Contenu mis à jour :");
        System.out.println("```\n" + contenu + "\n```\n");
    }
}
