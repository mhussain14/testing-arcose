package com.arceliktv.lotr.yto.common.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class PropertyHelper {

  public static Properties readProperties(String fileName)
      throws IOException {
    return readProperties(true, fileName);
  }

  public static Properties readProperties(boolean classPath, String fileName)
      throws IOException {
    InputStream inputStream;
    if (classPath) {
      inputStream = PropertyHelper.class.getClassLoader().getResourceAsStream(fileName);
    } else {
      inputStream = new FileInputStream(fileName);
    }

    return readProperties(inputStream);
  }


  public static Properties readProperties(InputStream inputStream) throws IOException {
    if (inputStream == null) {
      throw new FileNotFoundException("File Not Found");
    }
    Properties properties = new Properties();
    try {
      properties.load(inputStream);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      inputStream.close();
    }
    return properties;
  }

  public static <S> S propertiesToClass(String propertyFileName, Class<S> output)
      throws IllegalAccessException, InstantiationException, IOException {
    return propertiesToClass(readProperties(propertyFileName), output);
  }

  public static <S> S propertiesToClass(Properties properties, Class<S> output)
      throws IllegalAccessException, InstantiationException {
    S s = output.newInstance();
    for (Field field : output.getDeclaredFields()) {
      for (String propKey : properties.stringPropertyNames()) {
        if (field.getName().equals(propKey)) {
          field.setAccessible(true);
          field.set(s, properties.getProperty(propKey));
          field.setAccessible(false);
        }
      }
    }
    return s;
  }

  public static <S> S propertiesToClassWithAnnotation(String propertyFileName, Class<S> output)
      throws IllegalAccessException, InstantiationException, IOException {
    return propertiesToClassWithAnnotation(readProperties(propertyFileName), output);
  }

  public static <S> S propertiesToClassWithAnnotation(Properties properties, Class<S> output)
      throws IllegalAccessException, InstantiationException {
    S s = output.newInstance();
    com.arceliktv.lotr.yto.common.file.Prop tempProp;
    for (Field field : output.getDeclaredFields()) {
      if (!field.isAnnotationPresent(com.arceliktv.lotr.yto.common.file.Prop.class)) {
        continue;
      }
      tempProp = field.getAnnotation(com.arceliktv.lotr.yto.common.file.Prop.class);
      for (String propKey : properties.stringPropertyNames()) {
        if (tempProp.key().equals(propKey)) {
          setFieldValueByType(s, field, tempProp.type(), properties.getProperty(propKey));
        }
      }
    }
    return s;
  }

  private static <S> void setFieldValueByType(S output, Field field, com.arceliktv.lotr.yto.common.file.Prop.PropType propType,
      String value)
      throws IllegalAccessException {
    field.setAccessible(true);
    if (propType == com.arceliktv.lotr.yto.common.file.Prop.PropType.STRING) {
      field.set(output, value);
    } else if (propType == com.arceliktv.lotr.yto.common.file.Prop.PropType.DOUBLE) {
      field.setDouble(output, Double.parseDouble(value));
    } else if (propType == com.arceliktv.lotr.yto.common.file.Prop.PropType.FLOAT) {
      field.setFloat(output, Float.parseFloat(value));
    } else if (propType == com.arceliktv.lotr.yto.common.file.Prop.PropType.INT) {
      field.setInt(output, Integer.parseInt(value));
    } else if (propType == Prop.PropType.BOOL) {
      field.setBoolean(output, Boolean.parseBoolean(value));
    }

    field.setAccessible(false);
  }


}
