package lesson;

import java.util.Scanner;

public class mainFlat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        City[] citys = new City[n];
        for (int i = 0; i < citys.length; i++) {
            String nameCity = sc.next();
            int numCity = sc.nextInt();
            Flat[] flats = new Flat[numCity];
            for (int j = 0; j < flats.length; j++) {
                flats[j] = new Flat(sc.next(), sc.nextInt(), sc.nextInt());
            }
            citys[i] = new City(nameCity, numCity, flats);
        }

        for (City cities : citys) {
            cities.getCityData();
            System.out.println("*********************************");
            System.out.println("Cheapest flat with exactly 3 room is " + cities.exactlyFlat());
            System.out.println();
        }


    }
}
