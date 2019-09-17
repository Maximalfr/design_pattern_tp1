package com.abstract_factory.five;

import com.abstract_factory.five.count_folders.CountFolders;
import com.abstract_factory.five.count_folders.CountFoldersLinux;
import com.abstract_factory.five.parse_file_name.FileNameParser;
import com.abstract_factory.five.parse_file_name.ParseFileNameLinux;

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
