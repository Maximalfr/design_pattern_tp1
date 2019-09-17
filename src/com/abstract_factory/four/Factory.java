package com.abstract_factory.four;

public interface Factory {

    public FileNameParser getFileNameParser();

    public CountFolders getCountFolders();
}
