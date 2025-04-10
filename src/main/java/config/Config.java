package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("src\\test\\resources\\config\\properties");
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("Error loading config file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
            throw new RuntimeException("Property " + key + " is not specified in the config.properties file");
        }
        return value;
    }
}
