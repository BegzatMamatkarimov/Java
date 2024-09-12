package lesson;

import java.util.Scanner;

public class V1_2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        V1_2City[] v12City = new V1_2City[n];
        for (int i = 0; i < v12City.length; i++) {
            String cityName = sc.next();
            int citeNum = sc.nextInt();
            V1_2Pharmacy[] v12Pharmacies = new V1_2Pharmacy[citeNum];
            for (int j = 0; j < v12Pharmacies.length; j++) {
                String pharmaciesName = sc.next();
                int pharmaciesNum = sc.nextInt();
                V1_2Drug[] v12Drugs = new V1_2Drug[pharmaciesNum];
                for (int k = 0; k < v12Drugs.length; k++) {
                    String name = sc.next();
                    int prise = sc.nextInt();
                    String bool = sc.next();
                    v12Drugs[k] = new V1_2Drug(name, prise, bool);
                }
                v12Pharmacies[j] = new V1_2Pharmacy(pharmaciesName, pharmaciesNum, v12Drugs);
            }
            v12City[i] = new V1_2City(cityName, citeNum, v12Pharmacies);
        }

//        1
        for (V1_2City v12City1 : v12City) {
            v12City1.getDataOut();
        }
        System.out.println("****************************************");
        System.out.println();

//        2
        for (V1_2City v12City1 : v12City) {
            v12City1.getDataOut2();
        }

    }
}
