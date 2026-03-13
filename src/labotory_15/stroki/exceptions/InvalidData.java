package labotory_15.stroki.exceptions;

public class InvalidData extends RuntimeException {
    public InvalidData(String message) {
        super("Ошибка: " + message);
    }
}
