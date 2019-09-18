package com.state.one;

import java.util.Scanner;
import java.util.logging.Logger;

public class Distributeur {
    final static int etat_attente_carte = 0;
    final static int etat_attente_code = 1;
    final static int etat_attente_operation = 2;
    private int etat;
    private Carte c;
    private Logger logger = Logger.getLogger(Distributeur.class.getName());

    public Distributeur() {
        this.etat = etat_attente_carte;
    }

    public void insererCarte(Carte client) {
        Scanner sc = new Scanner(System.in);

        if (this.etat == etat_attente_carte) {
            this.logger.info("Insertion_carte_client");
            this.c = client;
            this.etat = etat_attente_code;
        }
        if (this.etat == etat_attente_code) {
            for (int i = 1; i <= 3; ++i) {
                System.out.print("Enter pin code: ");
                if (c.codeIsCorrect(sc.nextLine())) {
                    this.etat = etat_attente_operation;
                    break;
                }
                System.out.println(String.format("Wrong pin (%s/3)", i));
            }
            if (this.etat == etat_attente_code) { // Still in waiting card state, the card must be swallowed
                System.out.println("Your card has been swallowed");
                this.c = null;
                this.etat = etat_attente_carte;
            }
        }
        if (this.etat == etat_attente_operation) {
            System.out.println("Choose your operation:");
        }
    }
}
