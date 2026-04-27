package com.demo.Exercice3;

public class MainExercice3 {
    public static void main(String[] args) {
        System.out.println("=== Distributeur de Pizzas ===\n");

        // Pizza Hut
        PizzaFactory pizzaHut = PizzaHutFactory.getInstance();
        Pizza margheritaPH = pizzaHut.creerMargherita();
        Pizza fruttiPH = pizzaHut.creerFruttiDiMare();

        System.out.println("--- Pizza Hut ---");
        System.out.println(margheritaPH.getNom() + " : " + margheritaPH.getPrix() + "€");
        System.out.println("  Ingrédients: " + margheritaPH.getIngredients());
        System.out.println(fruttiPH.getNom() + " : " + fruttiPH.getPrix() + "€");
        System.out.println("  Ingrédients: " + fruttiPH.getIngredients());

        // Domino Pizza
        PizzaFactory domino = DominoFactory.getInstance();
        Pizza margheritaDom = domino.creerMargherita();
        Pizza fruttiDom = domino.creerFruttiDiMare();

        System.out.println("\n--- Domino Pizza ---");
        System.out.println(margheritaDom.getNom() + " : " + margheritaDom.getPrix() + "€");
        System.out.println("  Ingrédients: " + margheritaDom.getIngredients());
        System.out.println(fruttiDom.getNom() + " : " + fruttiDom.getPrix() + "€");
        System.out.println("  Ingrédients: " + fruttiDom.getIngredients());

        // Vérification du Singleton
        PizzaHutFactory instance1 = PizzaHutFactory.getInstance();
        PizzaHutFactory instance2 = PizzaHutFactory.getInstance();
        System.out.println("\nSingleton vérification: mêmes instances ? " + (instance1 == instance2));
    }
}
