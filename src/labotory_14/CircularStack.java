package labotory_14;

public class CircularStack extends AbstractQueue {
    CircularStack(int size) {
        super(size);
    }

    @Override
    public void put(char ch) {
        if (count == queue.length) {
            System.out.println("Очередь заполнена");
        }
        queue[front] = ch;
        front = (front + 1) % queue.length;
        count++;
    }

    @Override
    public char get() {
        if (front == 0) {
            System.out.print(" Очередь пуста");
            return ' ';
        }
        char ch = queue[--front];
        queue[front] = 'Ø';
        return ch;
    }
}
