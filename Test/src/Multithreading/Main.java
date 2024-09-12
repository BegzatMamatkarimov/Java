package Multithreading;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyThread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new MyThread((i + 1) * 100));
        }

        for (MyThread thread : threads) {
            thread.start();
        }
    }
}