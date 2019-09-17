package com.abstract_factory.five;

import com.abstract_factory.five.count_folders.CountFolders;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main_parse_filename(String path) {
        Factory factory = OSFactory.getFactory();
        CountFolders countFolders = factory.getCountFolders();
    }
}
