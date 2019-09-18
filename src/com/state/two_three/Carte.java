package com.state.two_three;

public class Carte {
    private final String pin;

    public Carte(String pin) {
        this.pin = pin;
    }

    public boolean codeIsCorrect(String pin) {
        return this.pin.equals(pin);
    }
}
