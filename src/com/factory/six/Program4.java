package com.factory.six;

import java.util.logging.Logger;

public class Program4 implements ProgramInterface {

    private Logger logger = Logger.getLogger(Program4.class.getName());

    public Program4() {}

    public void go() {
        this.logger.info("Je_suis_le_traitement_4");
    }
}
