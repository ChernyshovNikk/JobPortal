package by.bsuir.jobproject.util;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * Created by AR on 29.04.2017.
 */
public class ConfigurationManager {
    private final static ResourceBundle resourceBundle = PropertyResourceBundle.getBundle("config");

    private ConfigurationManager(){

    }

    public static String getProperty(String key){
        return resourceBundle.getString(key);
    }
}