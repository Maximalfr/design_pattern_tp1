package com.abstract_factory.three;

public interface Factory {

    public FileNameParser getFileNameParser();

    public CountFolders getCountFolders();
}
