package labotory_14;

public class CircularQueue extends AbstractQueue {
    private int count;

    CircularQueue(int size) {
        super(size);
        count = 0;
    }

    @Override
    public void reset() {
        front = rear = count = 0;
        queue = new char[queue.length];
    }

    @Override
    public void put(char ch) {
        if (count == queue.length) {
            System.out.println("Очередь заполнена, нужно извлечь элементы");
            return;
        }
        queue[front] = ch;
        front = (front + 1) % queue.length;
        count++;
    }

    @Override
    public char get() {
        if (count == 0) {
            System.out.print(" Очередь пуста");
            return ' ';
        }
        count--;
        char buf = queue[rear];
        rear = (rear + 1) % queue.length;
        return buf;
    }
}

