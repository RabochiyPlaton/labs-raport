package labotory_15.NewQueue;

public class DynamicCircularQueue extends AbstractQueue {
    private int count;

    DynamicCircularQueue(int size) {
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
            char[] t = new char[queue.length * 2];
            for (int i = 0; i < count; i++) {
                t[i] = queue[(rear + i) % queue.length];
            }
            queue = t;
            rear = 0;
            front = count;
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
        char ch = queue[rear];
        rear = (rear + 1) % queue.length;
        count--;
        return ch;
    }
}