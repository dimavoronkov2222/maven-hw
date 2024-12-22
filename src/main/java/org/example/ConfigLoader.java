package org.example;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ConfigLoader {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            prop.load(input);
            System.out.println("props.local.hello: " + prop.getProperty("props.local.hello"));
            System.out.println("props.mvn.hello: " + prop.getProperty("props.mvn.hello"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}