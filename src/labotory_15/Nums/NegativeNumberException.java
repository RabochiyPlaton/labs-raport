package labotory_15.Nums;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super("\u001B[33m" + message + "\u001B[0m");
    }
}
