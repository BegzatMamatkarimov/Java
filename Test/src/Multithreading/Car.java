package Multithreading;

public class Car extends Thread {
    private String name;
    private int speed;
    private static int finishLine;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void run() {
        int distance = 0;
        int time = 0;

        while (distance < finishLine) {
            distance += speed;
            time++;

            System.out.println(name + " is in " + distance + " meters");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " finished in " + time + " seconds");
    }

    public static void setFinishLine(int distance) {
        finishLine = distance;
    }

    public String getCarName() {
        return name;
    }

    public int getTime() {
        return (finishLine / speed);
    }
}

