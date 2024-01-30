package com.arceliktv.lotr.yto.report;

import com.arceliktv.lotr.yto.common.date.DateAndTimeHelper;

public class DatePattern {

  private final static String DATE_FORMAT = "dd.MM.yyyy";
  private final static String TIME_FORMAT = "HH:mm:ss";

  private DatePattern() {

  }

  public static String parse(String pattern) {
    if (pattern.contains("${date}")) {
      pattern = pattern.replace("${date}",
          DateAndTimeHelper.formatDate(DateAndTimeHelper.getNowDate(), DATE_FORMAT));
    }
    if (pattern.contains("${time}")) {
      pattern = pattern.replace("${time}",
          DateAndTimeHelper.formatDate(DateAndTimeHelper.getNowDate(), TIME_FORMAT));
    }
    return pattern;
  }
}
