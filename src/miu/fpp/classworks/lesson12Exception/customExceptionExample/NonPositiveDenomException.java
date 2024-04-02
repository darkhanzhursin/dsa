package miu.fpp.classworks.lesson12Exception.customExceptionExample;

public class NonPositiveDenomException extends Exception {

    public NonPositiveDenomException() {
        super();
    }
    public NonPositiveDenomException(Throwable t) {
        super(t);
    }
    public NonPositiveDenomException(String msg) {
        super(msg);
    }
}
