package Lab3;

import java.util.*;
// class work 1, 2
class Car {
    String name;
    String model;
    int maxSpeed;
    double engineVolume;

    Car() {}

    Car(String name, String model, int maxSpeed, double engineVolume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }

    String toStrings() {
        String info = ("Lab3.Car: " + name + " " + model + ", " + Integer.toString(maxSpeed)  + "km/h, " + Double.toString(engineVolume) + " liters");
        return info;
    }

    void ride(){
        if(engineVolume > 2.2){
            System.out.println("Lab3.Car is riding");
        }
        else{
            System.out.println("Couldn't start engine");
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[10];

        for (int i = 0; i < car.length; i++) {
            car[i] = new Car("CarName" + (i + 1), "Model" + + (i + 1), 100 + (i * 50),  (i + 1) * 1.1);
        }

        for (Car cars : car) {
            System.out.println(cars.toStrings());
            cars.ride();
        }
        System.out.println();
        System.out.println();

        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < car.length; i++) {
            if (car[i].maxSpeed > max) {
                max = car[i].maxSpeed;
                index = i;
            }
        }

        System.out.println(car[index].toStrings());
    }

}
