package com.abstract_factory.six;

import com.abstract_factory.six.count_folders.CountFoldersLinux;
import com.abstract_factory.six.count_folders.CountFolders;
import com.abstract_factory.six.parse_file_name.FileNameParser;
import com.abstract_factory.six.parse_file_name.ParseFileNameLinux;
import com.abstract_factory.six.source_file_name.LinuxSourceFileName;
import com.abstract_factory.six.source_file_name.SourceFileName;

public class LinuxFactory implements Factory {

    @Override
    public FileNameParser getFileNameParser() {
        return new ParseFileNameLinux();
    }

    @Override
    public CountFolders getCountFolders() {
        return new CountFoldersLinux();
    }

    @Override
    public SourceFileName getSourceFileName() {
        return new LinuxSourceFileName();
    }


}
