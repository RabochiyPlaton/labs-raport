package labotory_14;

interface Och {
    void put(char ch);

    char get();

    int getLength();

    void reset();

    char[] getQueue();

    void print();

    static Och save(Och och) {
        char[] currentData = och.getQueue();
        FixedQueue copy = new FixedQueue(currentData.length);
        for (char c : currentData) {
            if (c != 0 && c != ' ') {
                copy.put(c);
            }
        }
        return copy;
    }
}