package com.state.two_three;

public class Main {

    public static void main(String[] args) {
        Distributeur d = new Distributeur();
        Carte c = new Carte("4444");
        d.insererCarte(c);
    }
}