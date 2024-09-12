package Lab3;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Laptop1 {

    String name;
    int price;
    int generation_of_CPU; // 8,9,10
    String ssd;  //да или нет

    public Laptop1() {
    }
    public Laptop1(String name, int price, int generation_of_CPU, String ssd) {
        this.name = name;
        this.price = price;
        this.generation_of_CPU = generation_of_CPU;
        this.ssd = ssd;
    }

    int result;
    int colculate(){
        switch (generation_of_CPU){
            case (8):
                result = price + price * 10 / 100;
                break;
            case (9):
                result = price + price * 15 / 100;
                break;
            case (10):
                result = price + price * 20 / 100;
                break;
        }

        if(Objects.equals(ssd, "YES")){
            result += price * 15 / 100;
        }

        return result;
    }
}

class LapTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Laptop1[] laptop1 = new Laptop1[n];
        for (int i = 0; i < laptop1.length; i++) {
            laptop1[i] = new Laptop1(sc.next(), sc.nextInt(), sc.nextInt(), sc.next());
            sc.nextLine();
        }

        for (int i = 0; i < laptop1.length; i++) {
            System.out.println(laptop1[i].name + " " + laptop1[i].colculate());
        }
    }
}
