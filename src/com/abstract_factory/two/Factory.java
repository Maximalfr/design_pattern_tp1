package com.abstract_factory.two;

public class Factory {

    private boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    public FileNameParser getFileNameParser() {
        if (!isWindows())
            return new ParseFileNameLinux();
        else
            return new ParseFileNameWindows();
    }

    public CountFolders getCountFolders() {
        if (isWindows())
            return new CountFoldersWindows();
        else
            return new CountFoldersLinux();

    }
}
