package com.abstract_factory.six;

import com.abstract_factory.six.count_folders.CountFolders;
import com.abstract_factory.six.count_folders.CountFoldersWindows;
import com.abstract_factory.six.parse_file_name.FileNameParser;
import com.abstract_factory.six.parse_file_name.ParseFileNameWindows;
import com.abstract_factory.six.source_file_name.SourceFileName;
import com.abstract_factory.six.source_file_name.WindowsSourceFileName;

public class WindowsFactory implements Factory {

    public FileNameParser getFileNameParser() {
        return new ParseFileNameWindows();
    }

    public CountFolders getCountFolders() {
        return new CountFoldersWindows();
    }

    @Override
    public SourceFileName getSourceFileName() {
        return new WindowsSourceFileName();
    }
}
