package com.singleton.four;

public class Aeroport {
    boolean piste_libre;
    private static Aeroport instance;

    private Aeroport() {
        this.piste_libre = true;
    }

    public static synchronized Aeroport getInstance() {
        if (Aeroport.instance != null)
            return Aeroport.instance;

        try {
            Thread.sleep(500);
        } catch (Exception ignore){}

        Aeroport.instance = new Aeroport();
        return Aeroport.instance;
    }
}
