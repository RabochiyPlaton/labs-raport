package labotory_14;

import java.util.Scanner;

interface Och {
    void put(char ch);

    char get();

    int getLength();

    void reset();

    char[] getQueue();

    void print();

    static Och save(Och och, Scanner scanner) {
        Och newOch = CreateQueue.create(scanner);
        char[] newQueue = och.getQueue();
        for (int i = 0; i < newQueue.length; i++) {
            char ch = newQueue[i];
            if (ch != '_' && ch != 'Ø') {
                newOch.put(ch);
            }
        }
        System.out.println("Очередь сохранена");
        return newOch;
    }

    static void filling(char [] chs) {
        for (int i = 0; i < chs.length ;i++){
            chs[i]='_';
        }
    }
}