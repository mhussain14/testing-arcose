package com.arceliktv.lotr.yto.common.file;

import java.io.File;
import java.net.URI;

public interface FileReader {

  String readFileAsString(String filePath);

  String readFileAsString(File file);

  String readFileAsString(URI uri);

}
