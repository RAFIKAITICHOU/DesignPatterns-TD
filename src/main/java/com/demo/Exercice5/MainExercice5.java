package com.demo.Exercice5;

public class MainExercice5 {
    public static void main(String[] args) {
        System.out.println("=== IoT Sécurité Domestique ===\n");

        DispositifSecurite maison = new DispositifSecurite();

        ApplicationIOS iphone = new ApplicationIOS("Alice");
        ApplicationAndroid samsung = new ApplicationAndroid("Bob");
        ApplicationIOS ipad = new ApplicationIOS("Alice (iPad)");

        maison.ajouterObservateur(iphone);
        maison.ajouterObservateur(samsung);
        maison.ajouterObservateur(ipad);

        System.out.println("--- Scénario 1 : Bruit anormal ---");
        maison.detecterBruitAnormal(85.5, "Salon");

        System.out.println("\n--- Scénario 2 : Mouvement suspect ---");
        maison.detecterMouvement("Cuisine");

        System.out.println("\n--- Scénario 3 : Fenêtre ouverte ---");
        maison.detecterFenetreOuverte("Chambre");

        System.out.println("\n--- Scénario 4 : Désinscription d'un observateur ---");
        maison.supprimerObservateur(samsung);
        System.out.println("(Bob a désinstallé l'application Android)");

        System.out.println("\n--- Scénario 5 : Nouvel événement (sans Android) ---");
        maison.detecterMouvement("Garage");
    }
}
