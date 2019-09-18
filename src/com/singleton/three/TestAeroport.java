package com.singleton.three;

public class TestAeroport {
    public static void main(String[] args) {
        Avion v1 = new Avion("Avion_1");
        Avion v2 = new Avion("Avion_2");
        Avion v3 = new Avion("Avion_3");
        Avion v4 = new Avion("Avion_4");
        v1.start();
        v2.start();
        v3.start();
        v4.start();
    }
}
