package labotory_14;

public class CircularStack extends AbstractQueue {
    CircularStack(int size) {
        super(size);
        style = "Кольцевой стэк";
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
        if (count == 0) {
            System.out.print(" Очередь пуста");
            return ' ';
        }
        front = (front - 1 + queue.length) % queue.length;
        char ch = queue[front];
        queue[front] = 'Ø';
        count--;
        return ch;
    }
}
