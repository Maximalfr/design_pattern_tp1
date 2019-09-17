package com.abstract_factory.five;

import com.abstract_factory.five.count_folders.CountFolders;
import com.abstract_factory.five.count_folders.CountFoldersMacintosh;
import com.abstract_factory.five.parse_file_name.FileNameParser;
import com.abstract_factory.five.parse_file_name.ParseFileNameMacintosh;

public class MacintoshFactory implements Factory {
    @Override
    public FileNameParser getFileNameParser() {
        return new ParseFileNameMacintosh();
    }

    @Override
    public CountFolders getCountFolders() {
        return new CountFoldersMacintosh();
    }
}
