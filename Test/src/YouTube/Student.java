package YouTube;

public class Student extends Person{
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public String getInfo() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
