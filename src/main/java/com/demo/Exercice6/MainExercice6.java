package com.demo.Exercice6;

public class MainExercice6 {
    public static void main(String[] args) {
        System.out.println("=== HébergeKech - Calculateur de coûts ===\n");

        // Offre Perso seule
        Offre perso = new OffrePerso();
        afficherOffre(perso);

        // Offre Perso + SSL
        Offre persoSSL = new SSL(new OffrePerso());
        afficherOffre(persoSSL);

        // Offre Perso + SSL + Sauvegardes
        Offre persoComplet = new Sauvegardes(new SSL(new OffrePerso()));
        afficherOffre(persoComplet);

        System.out.println("---");

        // Offre Pro + Support247
        Offre proSupport = new Support247(new OffrePro());
        afficherOffre(proSupport);

        // Offre Pro + Support247 + MySQL
        Offre proComplet = new MySQL(new Support247(new OffrePro()));
        afficherOffre(proComplet);

        System.out.println("---");

        // Offre Premium avec toutes les options
        Offre premiumComplet = new GoogleAdwords(
                new MySQL(
                        new Sauvegardes(
                                new Support247(
                                        new SSL(
                                                new OffrePremium()
                                        )
                                )
                        )
                )
        );
        afficherOffre(premiumComplet);

        // Offre Premium avec combinaison personnalisée
        System.out.println("--- Combinaison personnalisée ---");
        Offre persoLight = new Sauvegardes(new OffrePerso());
        afficherOffre(persoLight);

        Offre proBusiness = new GoogleAdwords(new MySQL(new OffrePro()));
        afficherOffre(proBusiness);
    }

    private static void afficherOffre(Offre offre) {
        System.out.printf("%s : %.2f€/mois\n", offre.getDescription(), offre.getCout());
    }
}
