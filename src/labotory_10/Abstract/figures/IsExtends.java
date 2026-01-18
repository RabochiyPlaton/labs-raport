package labotory_10.Abstract.figures;

public class IsExtends extends RuntimeException {

    public IsExtends(String message) {
        super("\u001B[33m" + message + "\u001B[0m");
    }
}
