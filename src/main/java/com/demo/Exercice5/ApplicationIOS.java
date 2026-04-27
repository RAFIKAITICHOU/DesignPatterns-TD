package com.demo.Exercice5;

public class ApplicationIOS implements Observateur {
    private String proprietaire;

    public ApplicationIOS(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public void notifier(String message) {
        System.out.println("[iOS - " + proprietaire + "] Notification push reçue :");
        System.out.println("  📱 " + message);
    }
}
