package com.state.two_three;

import java.util.Scanner;
import java.util.logging.Logger;

public class Distributeur {
    final Etat attenteCarte = new AttenteCarte();
    final Etat AttenteCode = new AttenteCode();
    final Etat attenteOperation = new AttenteOperation();
    private Etat etat;
    private Carte c;
    private Logger logger = Logger.getLogger(Distributeur.class.getName());

    public Distributeur() {
        this.etat = attenteCarte;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Etat getEtat() {
        return this.etat;
    }

    public void setCarte(Carte carte) {
        this.c = carte;
    }

    public Carte getCarte() {
        return this.c;
    }
}
