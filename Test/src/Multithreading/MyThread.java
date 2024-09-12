package Multithreading;

class MyThread extends Thread {
    private int delay;

    public MyThread(int delay) {
        this.delay = delay;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": Count " + i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


