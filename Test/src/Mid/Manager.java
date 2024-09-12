package Mid;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int age, int workHours, int salaryPerHour, int bonus) {
        super(name, age, workHours, salaryPerHour);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    double calculateSalary(){
        return super.calculateSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + calculateSalary() +
                '}';
    }


}
