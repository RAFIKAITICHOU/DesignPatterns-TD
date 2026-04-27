package com.demo.Exercice4;

import java.util.ArrayList;
import java.util.List;

public class Modele {
    private List<Observateur> observateurs = new ArrayList<>();
    private String contenu;

    public void attacher(Observateur obs) {
        observateurs.add(obs);
    }

    public void detacher(Observateur obs) {
        observateurs.remove(obs);
    }

    private void notifier() {
        for (Observateur obs : observateurs) {
            obs.actualiser(contenu);
        }
    }

    public void setContenu(String nouveauContenu) {
        this.contenu = nouveauContenu;
        notifier();
    }

    public String getContenu() {
        return contenu;
    }
}
