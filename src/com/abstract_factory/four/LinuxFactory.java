package com.abstract_factory.four;

public class LinuxFactory implements Factory {

    @Override
    public FileNameParser getFileNameParser() {
        return new ParseFileNameLinux();
    }

    @Override
    public CountFolders getCountFolders() {
        return new CountFoldersLinux();
    }
}
