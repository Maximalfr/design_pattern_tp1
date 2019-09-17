package com.abstract_factory.four;

public class WindowsFactory implements Factory {

    public FileNameParser getFileNameParser() {
        return new ParseFileNameWindows();
    }

    public CountFolders getCountFolders() {
        return new CountFoldersWindows();
    }
}
