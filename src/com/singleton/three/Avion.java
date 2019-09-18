package com.singleton.three;

import java.util.logging.Logger;

public class Avion extends Thread {
    String nom;
    Aeroport a;
    Logger logger = Logger.getLogger(Avion.class.getName());

    public Avion(String s) {
        this.nom = s;
    }

    @Override
    public void run() {
        a = Aeroport.getInstance();
        logger.info(String.format("Je_suis_l'avion_%s_sur_l'aeroport_%s", this.nom, a));
    }
}
