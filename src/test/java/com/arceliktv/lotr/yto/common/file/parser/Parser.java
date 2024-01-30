package com.arceliktv.lotr.yto.common.file.parser;

import com.arceliktv.lotr.yto.common.exception.FileParseException;
import java.io.IOException;
import java.io.InputStream;

public interface Parser {

  <S> S parseFile(String text, Class<S> type) throws FileParseException, IOException;

  <S> S parseFile(InputStream inputStream, Class<S> type) throws FileParseException, IOException;


}
