package labotory_15.stroki.exceptions;

public class EmptyInput extends RuntimeException {
    public EmptyInput() {
        super("Ошибка: Строка состоит только из пробелов");
    }
}
