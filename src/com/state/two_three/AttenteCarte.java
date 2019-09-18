package com.state.two_three;

import java.util.logging.Logger;

public class AttenteCarte implements Etat {

    Logger logger = Logger.getLogger(AttenteCarte.class.getName());

    @Override
    public void insererCarte(Carte carte, Distributeur distributeur) {
        if (carte != null) {
            distributeur.setCarte(carte);
            this.logger.info("Insertion_carte_client");
            distributeur.setEtat(distributeur.AttenteCode);
        }
    }

    @Override
    public void entrerCode(String pin, Distributeur distributeur) {
    }

    @Override
    public void retirerArgent(int montant, Distributeur distributeur) {
    }

    @Override
    public void reprendreCarte(Distributeur distributeur) {
    }
}
