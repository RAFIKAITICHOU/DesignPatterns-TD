package com.demo.Exercice2;

public class MainExercice2 {
    public static void main(String[] args) {
        System.out.println("=== Gestion des Plans de Pièce ===\n");

        // Plan de base
        Plan planBase = new PlanDeBase();
        System.out.println("1. " + planBase.afficher());

        // Plan avec mesures
        Plan planMesures = new AvecMesures(new PlanDeBase());
        System.out.println("2. " + planMesures.afficher());

        // Plan avec devis
        Plan planDevis = new AvecDevis(new PlanDeBase());
        System.out.println("3. " + planDevis.afficher());

        // Plan avec devis et mesures
        Plan planComplet = new AvecDevis(new AvecMesures(new PlanDeBase()));
        System.out.println("4. " + planComplet.afficher());
    }
}
