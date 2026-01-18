package labotory_15.Nums;

public class FactorialOverflowException extends Exception {
    public FactorialOverflowException(String message) {
        super("\u001B[33m" + message + "\u001B[0m");
    }
}
