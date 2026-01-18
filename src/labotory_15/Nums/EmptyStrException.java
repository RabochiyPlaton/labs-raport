package labotory_15.Nums;

public class EmptyStrException extends RuntimeException {
    public EmptyStrException(String message) {
        super("\u001B[33m" + message + "\u001B[0m");
    }
}
