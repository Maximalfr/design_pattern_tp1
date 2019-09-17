package com.abstract_factory.three;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main_parse_filename(String path) {
        Factory factory = new LinuxFactory();
        CountFolders countFolders = factory.getCountFolders();
    }
}
