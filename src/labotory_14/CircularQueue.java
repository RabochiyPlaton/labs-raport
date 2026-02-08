package labotory_14;

public class CircularQueue extends AbstractQueue {

    CircularQueue(int size) {
        super(size);
        style = "Кольцевая очередь";
    }

    @Override
    public void put(char ch) {
        if (count == queue.length) {
            System.out.println("Очередь заполнена");
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
        char ch = queue[rear];
        queue[rear] = 'Ø';
        rear = (rear + 1) % queue.length;
        count--;
        return ch;
    }
}