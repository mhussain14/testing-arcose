package com.arceliktv.lotr.yto.common.file;

public interface FileParser {
  <S> S parseFile(String filePath, Class<S> output);

  <S> S parseFile(String filePath, Class<S> output,boolean classPath);
}
