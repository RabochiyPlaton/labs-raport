package labotory_15.NewQueue;

public class FixedQueue extends AbstractQueue {

    FixedQueue(int size) {
        super(size);
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
            System.out.print(" Очередь пуста");
            return ' ';
        }
        return queue[rear++];
    }
}
