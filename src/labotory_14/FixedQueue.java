package labotory_14;

public class FixedQueue extends AbstractQueue {

    FixedQueue(int size) {
        super(size);
        style = "Фиксированная очередь";
    }

    @Override
    public void put(char ch) {
        if (front == queue.length) {
            System.out.print(" Очередь заполнена");
            return;
        }
        queue[front++] = ch;
    }

    @Override
    public char get() {
        if (front == rear) {
            System.out.print("Очередь пуста");
            return ' ';
        }
        char ch = queue[rear++];
        queue[rear-1] = 'Ø';
        return ch;
    }
}
