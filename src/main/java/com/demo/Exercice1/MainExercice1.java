package com.demo.Exercice1;

public class MainExercice1 {
    public static void main(String[] args) {
        System.out.println("=== Gestion des Desserts ===\n");

        // Crêpe nature
        Dessert crepe = new Crepe();
        System.out.println(crepe.getNom() + " : " + crepe.getPrix() + "DH");

        // Crêpe + Chocolat
        Dessert crepeChoco = new Chocolat(new Crepe());
        System.out.println(crepeChoco.getNom() + " : " + crepeChoco.getPrix() + "DH");

        // Gaufre + Chantilly
        Dessert gaufreChantilly = new Chantilly(new Gaufre());
        System.out.println(gaufreChantilly.getNom() + " : " + gaufreChantilly.getPrix() + "DH");

        // Crêpe + Chocolat + Chantilly
        Dessert crepeComplet = new Chantilly(new Chocolat(new Crepe()));
        System.out.println(crepeComplet.getNom() + " : " + crepeComplet.getPrix() + "DH");

        // Gaufre + Chocolat + Chantilly
        Dessert gaufreComplet = new Chantilly(new Chocolat(new Gaufre()));
        System.out.println(gaufreComplet.getNom() + " : " + gaufreComplet.getPrix() + "DH");
    }
}
