package com.factory.six;

import java.util.logging.Logger;

public class Program1 implements ProgramInterface {

    private Logger logger = Logger.getLogger(Program1.class.getName());

    Program1() {}

    public void go() {
        logger.info("Je_suis_le_traitement_1");
    }
}
