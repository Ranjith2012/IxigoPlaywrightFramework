package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties properties;

    public static void initConfigReader(){
        properties = new Properties();
        try {
            properties.load(new FileInputStream("src/test/resources/config/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setConfigValue(String key, String val){
        properties.setProperty(key,val);
    }

    public static String getConfigValue(String key) {
        return properties.getProperty(key);
    }
}
