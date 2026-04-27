package com.demo.Exercice5;

public class ApplicationAndroid implements Observateur {
    private String proprietaire;

    public ApplicationAndroid(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public void notifier(String message) {
        System.out.println("[Android - " + proprietaire + "] Notification push reçue :");
        System.out.println("  Message " + message);
    }
}
