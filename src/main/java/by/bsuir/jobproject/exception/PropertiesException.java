package by.bsuir.jobproject.exception;

/**
 * Created by AR on 16.04.2017.
 */
public class PropertiesException extends RuntimeException{
    public PropertiesException(String message) {
        super(message);
    }

    public PropertiesException(Throwable cause) {
        super(cause);
    }

    public PropertiesException(String message, Throwable cause) {
        super(message, cause);
    }
}
