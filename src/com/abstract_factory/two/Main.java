package com.abstract_factory.two;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main_parse_filename(String path) {
        int index = path.lastIndexOf('\\');
        String r = path.substring(index + 1);
        logger.info(r);
    }
}
