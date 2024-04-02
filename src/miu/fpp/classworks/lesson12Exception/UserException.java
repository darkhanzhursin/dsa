package miu.fpp.classworks.lesson12Exception;

public class UserException extends Exception {
    public UserException() {
        super();
    }
    public UserException(Throwable t) {
        super(t);
    }
    public UserException(String msg) {
        super(msg);
    }
}
