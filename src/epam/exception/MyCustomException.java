package epam.exception;

public class MyCustomException extends Exception {
    public MyCustomException(String msg) {
        super(msg);
    }

    public MyCustomException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
