package by.bsuir.jobproject.util;

import java.util.ResourceBundle;

/**
 * Created by AR on 29.04.2017.
 */
public class MessageManager {
    private final static ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

    private MessageManager(){

    }

    public static String getProperty(String key){
        return resourceBundle.getString(key);
    }
}
