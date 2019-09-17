package com.abstract_factory.six;

import com.abstract_factory.six.count_folders.CountFolders;
import com.abstract_factory.six.count_folders.CountFoldersMacintosh;
import com.abstract_factory.six.parse_file_name.FileNameParser;
import com.abstract_factory.six.parse_file_name.ParseFileNameMacintosh;
import com.abstract_factory.six.source_file_name.MacintoshSourceFileName;
import com.abstract_factory.six.source_file_name.SourceFileName;

public class MacintoshFactory implements Factory {
    @Override
    public FileNameParser getFileNameParser() {
        return new ParseFileNameMacintosh();
    }

    @Override
    public CountFolders getCountFolders() {
        return new CountFoldersMacintosh();
    }

    @Override
    public SourceFileName getSourceFileName() {
        return new MacintoshSourceFileName();
    }


}
