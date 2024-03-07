package com.itworx.winjigo.read_properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class ReadProperties {
   private ReadProperties(){}

   private static final String ROOT_PATH = System.getProperty("user.dir") +"/src/test/java/resources/";
   private static final String WINJIGO_CONFIG_PATH=ROOT_PATH.concat("winjigo_config.properties");
    public static Properties setWinjigoConfig() throws IOException {
        Properties configProperties = new Properties();
        FileInputStream inputStream = new FileInputStream(WINJIGO_CONFIG_PATH);
        configProperties.load(inputStream);
        return configProperties;
    }
}
