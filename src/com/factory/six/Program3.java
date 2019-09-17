package com.factory.six;

import java.util.logging.Logger;

public class Program3 implements ProgramInterface {

    private Logger logger = Logger.getLogger(Program3.class.getName());

    public Program3() {}

    public void go() {
        this.logger.info("Je_suis_le_traitement_3");
    }
}
