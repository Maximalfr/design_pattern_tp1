package com.abstract_factory.six;

import com.abstract_factory.six.count_folders.CountFolders;
import com.abstract_factory.six.parse_file_name.FileNameParser;
import com.abstract_factory.six.source_file_name.SourceFileName;

public interface Factory {

    public FileNameParser getFileNameParser();

    public CountFolders getCountFolders();

    public SourceFileName getSourceFileName();
}
