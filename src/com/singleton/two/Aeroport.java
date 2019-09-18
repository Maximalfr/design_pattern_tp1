package com.singleton.two;

public class Aeroport {
    boolean piste_libre;
    private static Aeroport instance;

    private Aeroport() {
        this.piste_libre = true;
    }

    public static Aeroport getInstance() {
        if (Aeroport.instance != null)
            return Aeroport.instance;

        Aeroport.instance = new Aeroport();
        return Aeroport.instance;
    }
}
