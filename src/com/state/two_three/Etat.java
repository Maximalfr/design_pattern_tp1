package com.state.two_three;

public interface Etat {

    void insererCarte(Carte carte, Distributeur distributeur);
    void entrerCode(String pin, Distributeur distributeur);
    void retirerArgent(int montant, Distributeur distributeur);
    void reprendreCarte(Distributeur distributeur);

}
