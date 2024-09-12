package Multithreading;

import java.util.ArrayList;
import java.util.Collections;

public class CarMain {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Car.setFinishLine(200);

        cars.add(new Car("Ferrari 1", 20));
        cars.add(new Car("Mercedes 1", 18));
        cars.add(new Car("Renault 2", 16));
        cars.add(new Car("BMW 1", 15));
        cars.add(new Car("Audi 1", 14));
        cars.add(new Car("Toyota 1", 13));
        cars.add(new Car("Chevrolet 1", 12));
        cars.add(new Car("Ford 1", 11));
        cars.add(new Car("Honda 1", 10));
        cars.add(new Car("Nissan 1", 9));

        for (Car car : cars) {
            car.start();
        }

        for (Car car : cars) {
            try {
                car.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Collections.sort(cars, (car1, car2) -> Integer.compare(car1.getTime(), car2.getTime()));

        System.out.println("\nFinal Classification:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Place " + (i + 1) + ": " + cars.get(i).getCarName() + " - " + cars.get(i).getTime() + " seconds");
        }
    }
}
