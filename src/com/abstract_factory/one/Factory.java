package com.abstract_factory.one;

public class Factory {

    public FileNameParser getFileNameParser(String path) {
        if (path.contains("/")) {
            return new ParseFileNameLinux();
        } else
            return new ParseFileNameWindows();
    }
}
