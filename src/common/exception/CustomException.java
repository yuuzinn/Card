package common.exception;

public class CustomException extends Exception {
    private final int ERROR_CODE;
    public CustomException(String msg, int errorCode) {
        super(msg);
        this.ERROR_CODE = errorCode;
    }

    public CustomException(String msg) {
        this(msg, 100);
    }

    public int getErrorCode() {
        return this.ERROR_CODE;
    }
}