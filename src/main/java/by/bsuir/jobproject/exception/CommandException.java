package by.bsuir.jobproject.exception;

/**
 * Created by AR on 29.03.2017.
 */
public class CommandException extends Exception {
    public CommandException(String message) {
        super(message);
    }

    public CommandException(Throwable cause) {
        super(cause);
    }

    public CommandException(String message, Throwable cause) {
        super(message, cause);
    }
}
