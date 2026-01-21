package labotory_14;

public class FixedStack extends AbstractQueue {

    FixedStack(int size) {
        super(size);
    }

    @Override
    public void put(char ch) {
        if (front == queue.length) {
            System.out.println("Очередь заполнена");
            return;
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