package by.bsuir.jobproject.exception;


public class ConverterException extends Exception {
    public ConverterException(String message) {
        super(message);
    }

    public ConverterException(Throwable cause) {
        super(cause);
    }

    public ConverterException(String message, Throwable cause) {
        super(message, cause);
    }
}
