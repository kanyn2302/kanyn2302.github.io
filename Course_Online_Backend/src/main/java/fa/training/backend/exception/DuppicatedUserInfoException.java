package fa.training.backend.exception;

public class DuppicatedUserInfoException extends Exception{
    private static final long serialVersionUID = 1L;

    public DuppicatedUserInfoException(String message) {
        super(message);
    }

    public DuppicatedUserInfoException(String message, Throwable t) {
        super(message, t);
    }
}
