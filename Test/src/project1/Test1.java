package project1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = ("▬" + " ");
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int n = sc.nextInt();
        switch (n) {
            case 1:
                arr[2][0] = ("x" + " ");
                break;
            case 2:
                arr[2][1] = ("x" + " ");
                break;
            case 3:
                arr[2][2] = ("x" + " ");
                break;
            case 4:
                arr[1][0] = ("x" + " ");
                break;
            case 5:
                arr[1][1] = ("x" + " ");
                break;
            case 6:
                arr[1][2] = ("x" + " ");
                break;
            case 7:
                arr[0][0] = ("x" + " ");
                break;
            case 8:
                arr[0][1] = ("x" + " ");
                break;
            case 9:
                arr[0][2] = ("x" + " ");
                break;

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//▬ ▬ ▬
//▬ ▬ ▬
//▬ ▬ ▬