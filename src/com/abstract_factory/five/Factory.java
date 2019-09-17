package com.abstract_factory.five;

import com.abstract_factory.five.count_folders.CountFolders;
import com.abstract_factory.five.parse_file_name.FileNameParser;

public interface Factory {

    public FileNameParser getFileNameParser();

    public CountFolders getCountFolders();
}
