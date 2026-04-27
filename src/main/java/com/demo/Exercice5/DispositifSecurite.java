package com.demo.Exercice5;

import java.util.ArrayList;
import java.util.List;

public class DispositifSecurite {
    private List<Observateur> observateurs = new ArrayList<>();

    public void ajouterObservateur(Observateur obs) {
        observateurs.add(obs);
    }

    public void supprimerObservateur(Observateur obs) {
        observateurs.remove(obs);
    }

    private void alerterObservateurs(String message) {
        for (Observateur obs : observateurs) {
            obs.notifier(message);
        }
    }

    public void detecterBruitAnormal(double niveauBruit, String localisation) {
        String message = "⚠️ ALERTE : Bruit anormal détecté ! Niveau: " + niveauBruit + "dB, Localisation: " + localisation;
        System.out.println("[Capteur] " + message);
        alerterObservateurs(message);
    }

    public void detecterMouvement(String localisation) {
        String message = "🚨 ALERTE : Mouvement détecté dans " + localisation;
        System.out.println("[Capteur] " + message);
        alerterObservateurs(message);
    }

    public void detecterFenetreOuverte(String piece) {
        String message = "🔔 INFO : Fenêtre ouverte dans " + piece;
        System.out.println("[Capteur] " + message);
        alerterObservateurs(message);
    }
}
