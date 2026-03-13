package labotory_15.stroki.exceptions;

public class WordCount extends RuntimeException {
    public WordCount(int min) {
        super("Ошибка: недостаточно слов. Нужно минимум: " + min);
    }
}
