package com.demo.Exercice4;

public class VueWYSIWYG implements Observateur {
    private String nom;

    public VueWYSIWYG(String nom) {
        this.nom = nom;
    }

    @Override
    public void actualiser(String contenu) {
        System.out.println("[" + nom + " - Vue WYSIWYG] Affichage formaté :");
        System.out.println("╔════════════════════════╗");
        System.out.println("║ " + contenu + " ║");
        System.out.println("╚════════════════════════╝\n");
    }
}
