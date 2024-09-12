package lesson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Student {
    String name;
    String surname;
    String group;
    int mark_math;
    int mark_english;
    int mark_programming;

    public Student() {
    }

    public Student(String name, String surname, String group, int mark_math, int mark_english, int mark_programming) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.mark_math = mark_math;
        this.mark_english = mark_english;
        this.mark_programming = mark_programming;
    }

    double avg(){
        return ((double) (mark_math + mark_english + mark_programming) / 3);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }

        Arrays.sort(students, Comparator.comparing(student -> student.name));

        for (Student student : students) {
            System.out.println(student.name + " " + student.surname + " " + student.group + " " + student.avg());
        }

    }
}
