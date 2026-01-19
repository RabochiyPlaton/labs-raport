package labotory_15.newQueue;

public class CircularQueue extends AbstractQueue {

    CircularQueue(int size) {
        super(size);
        count = 0;
    }

    @Override
    public void put(char ch) {
        if (front == queue.length) {
            System.out.println("Стек заполнен");
            return;
        }
        queue[front++] = ch;
    }

    @Override
    public char get() {
        if (front == 0) {
            System.out.println("Стек пуст");
            return ' ';
        }
        return queue[--front];
    }
}

