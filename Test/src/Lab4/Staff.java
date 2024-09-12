package Lab4;

public class Staff extends User{
    private double salary;
    private String[] subjects = new String[100];
    private int indexOfSubject = 0;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }


    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }


    public void addSubject(String subject){
        subjects[indexOfSubject++] = subject;
    }

    public void getData() {
        super.getData();
        System.out.println( ", Salary:" + salary);
        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }

}
