package com.shreya.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties properties = new Properties();
    public ConfigReader() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        properties.load(fis);
    }
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}

