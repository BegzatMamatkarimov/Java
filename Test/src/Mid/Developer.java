package Mid;

public class Developer extends Employee{
    private int KPI;

    public Developer(String name, int age, int workHours, int salaryPerHour, int KPI) {
        super(name, age, workHours, salaryPerHour);
        this.KPI = KPI;
    }

    public int getKPI() {
        return KPI;
    }

    public void setKPI(int KPI) {
        this.KPI = KPI;
    }

    double calculateSalary(){
        return super.calculateSalary() + super.calculateSalary() * (KPI / 100);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + calculateSalary() +
                '}';
    }
}
