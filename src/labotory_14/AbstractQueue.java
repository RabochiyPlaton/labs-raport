package labotory_14;

abstract class AbstractQueue implements Och {

    protected char[] queue;
    protected int front, rear;
    protected int count;
    protected String style;

    AbstractQueue(int size) {
        front = rear = count = 0;
        queue = new char[size];
        Och.filling(queue);
    }

    public char[] getQueue() {
        return queue;
    }

    @Override
    public void print() {
        System.out.println("Тип очереди = <<"+style+">>");
        System.out.println("Состав очереди: ");
        System.out.print("[ ");
        for(int i = 0; i < queue.length; i++) {
            System.out.print(queue[i]);
            if (i<queue.length-1) System.out.print("; ");
            else System.out.print(" ");
        }
        System.out.print("]");
    }

    @Override
    public void reset() {
        front = rear = count = 0;
        queue = new char[queue.length];
        Och.filling(queue);
    }

    @Override
    public int getLength() {
        return queue.length;
    }

    @Override
    public abstract void put(char ch);

    @Override
    public abstract char get();
}
