package labotory_15.NewQueue;

public class FixedStack extends AbstractQueue {

    FixedStack(int size) {
        super(size);
        rear = size;
    }

    @Override
    public void reset() {
        super.reset();
        rear = queue.length;
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
        if (rear == 0) {
            System.out.print(" Очередь пуста");
            return ' ';
        }
        return queue[--rear];
    }
}
