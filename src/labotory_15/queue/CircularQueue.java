package labotory_15.queue;

public class CircularQueue extends AbstractQueue {

    CircularQueue(int size) {
        super(size);
        style = "Кольцевая очередь";
    }

    @Override
    public void put(char ch) {
        try {
            if (count == queue.length) {
                throw new OverflowQueue("очередь заполнена");
            }
        } catch (OverflowQueue ex) {
            System.out.println(ex.getMessage());
        }
        queue[front] = ch;
        front = (front + 1) % queue.length;
        count++;
    }

    @Override
    public char get() {
        try {
            if (count == 0) {
                throw new EmptyQueue("очередь пуста");
            }
        } catch (EmptyQueue ex) {
            System.out.println(ex.getMessage());
        }
        char ch = queue[rear];
        queue[rear] = 'Ø';
        rear = (rear + 1) % queue.length;
        count--;
        return ch;
    }
}