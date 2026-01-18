package labotory_15.NewQueue;

public class CircularStack extends AbstractQueue {
    CircularStack(int size) {
        super(size);
    }

    @Override
    public void put(char ch) {
        if (front == queue.length) {
            System.out.println("Очередь заполнена, нужно извлечь элементы");
            return;
        }
        queue[front++] = ch;
    }

    @Override
    public char get() {
        if (front == 0) {
            System.out.print(" Очередь пуста");
            return ' ';
        }
        return queue[--front];
    }
}