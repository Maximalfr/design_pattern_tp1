package com.abstract_factory.three;

public class WindowsFactory implements Factory{

    public FileNameParser getFileNameParser() {
        return new ParseFileNameWindows();
    }

    public CountFolders getCountFolders() {
        return new CountFoldersWindows();
    }
}
