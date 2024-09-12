package lesson;

import java.util.Scanner;

public class V1_1StudMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V1_1Stud[] v11Stud = new V1_1Stud[5];
        for (int i = 0; i < v11Stud.length; i++) {
            String line = sc.nextLine();

            String[] parts = line.split(" ");
            v11Stud[i] = new V1_1Stud(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
        }

        for (V1_1Stud v11Stud1 : v11Stud) {
            v11Stud1.analis();
        }
    }
}
