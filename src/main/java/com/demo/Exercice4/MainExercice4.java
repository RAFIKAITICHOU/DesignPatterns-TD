package com.demo.Exercice4;

public class MainExercice4 {
    public static void main(String[] args) {
        System.out.println("=== Gestion de Vues (Modèle-Vue/Observer) ===\n");

        Modele document = new Modele();

        VueSource vueSource = new VueSource("SourceView");
        VueWYSIWYG vueWysiwyg = new VueWYSIWYG("WYSIWYGView");

        document.attacher(vueSource);
        document.attacher(vueWysiwyg);

        System.out.println("--- Première modification ---");
        document.setContenu("<html><body><h1>Titre</h1><p>Paragraphe</p></body></html>");

        System.out.println("--- Deuxième modification ---");
        document.setContenu("<html><body><h1>Nouveau Titre</h1><p>Nouveau contenu</p></body></html>");

        System.out.println("--- Détachement de la vue Source ---");
        document.detacher(vueSource);

        System.out.println("--- Troisième modification (seule vue WYSIWYG reste) ---");
        document.setContenu("<html><body><p>Dernière version</p></body></html>");
    }
}
