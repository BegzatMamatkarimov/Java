package Lab3;
// HW 1, 2

import java.text.DecimalFormat;
import java.util.Random;
import java.util.*;

public class Student {
    int id;
    String name;
    String surname ;
    double gpa;

    public Student() {}

    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    String getData(){
        return ("ID: " + id + ", Student: " + name + " " + surname + ", GPA: " + gpa);
    }
}

class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Student[] student = new Student[10];
        Student studentTest = new Student();
        for (int i = 0; i < 10; i++) {
            student[i] = new Student(i + 1, "Beko" + (i + 1), "Mamat" + (i + 1), random.nextDouble(5));
        }
        for(Student students : student){
            System.out.println(students.getData());
        }

        for (int j = 0; j < student.length; j++) {
            for (int i = 0; i < 9; i++) {
                if (student[i].gpa > student[i + 1].gpa){
                    studentTest = student[i];
                    student[i] = student[i + 1];
                    student[i + 1] = studentTest;
                }
            }
        }
        System.out.println("----------------");

        for(Student students : student){
            System.out.println(students.getData());
        }
    }
}
