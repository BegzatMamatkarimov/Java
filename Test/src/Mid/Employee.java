package Mid;

public class Employee {
    protected String name;
    protected int age;
    protected int workHours;
    protected int salaryPerHour;

    public Employee() {
    }

    public Employee(String name, int age, int workHours, int salaryPerHour) {
        this.name = name;
        this.age = age;
        this.workHours = workHours;
        this.salaryPerHour = salaryPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    double calculateSalary(){
        return workHours * salaryPerHour;
    }
    

}
