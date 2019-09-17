package com.factory.six;

import java.util.logging.Logger;

public class Program2 implements ProgramInterface {

    private Logger logger = Logger.getLogger(Program2.class.getName());

    Program2() {}

    public void go() {
        this.logger.info("Je_suis_le_traitement_2");
    }
}
