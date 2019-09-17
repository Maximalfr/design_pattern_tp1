package com.abstract_factory.five;

import com.abstract_factory.five.count_folders.CountFolders;
import com.abstract_factory.five.count_folders.CountFoldersWindows;
import com.abstract_factory.five.parse_file_name.FileNameParser;
import com.abstract_factory.five.parse_file_name.ParseFileNameWindows;

public class WindowsFactory implements Factory {

    public FileNameParser getFileNameParser() {
        return new ParseFileNameWindows();
    }

    public CountFolders getCountFolders() {
        return new CountFoldersWindows();
    }
}
