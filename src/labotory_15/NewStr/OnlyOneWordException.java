package labotory_15.NewStr;

public class OnlyOneWordException extends RuntimeException {
    public OnlyOneWordException(String message) {
        super("\u001B[33m" + message + "\u001B[0m");
    }
}
