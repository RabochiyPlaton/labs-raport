package labotory_14;

public class DynamicStack extends AbstractQueue {

    DynamicStack(int size) {
        super(size);
    }

    @Override
    public void put(char ch) {
        if (front == queue.length) {
            char[] t = new char[queue.length * 2];
            for (int i = 0; i < queue.length; i++)
                t[i] = queue[i];
            queue = t;
        }
        queue[front++] = ch;
        rear = front;
    }

    @Override
    public char get() {
        if (rear == 0) {
            System.out.print(" Очередь пуста");
            return ' ';
        }
        char ch = queue[--rear];
        queue[rear] = 'Ø';
        return ch;
    }
}