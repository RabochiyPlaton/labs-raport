package labotory_15.NewQueue;

abstract class AbstractQueue implements Och {

    protected char[] queue;
    protected int front, rear;

    AbstractQueue(int size) {
        front = rear = 0;
        queue = new char[size];
    }

    public char[] getQueue() {
        return queue;
    }

    @Override
    public void reset() {
        front = rear = 0;
        queue = new char[queue.length];
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
