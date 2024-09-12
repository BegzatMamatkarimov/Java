package YouTube;

public class Theacher extends  Person{
    String subject;

    public Theacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return "Theacher{" +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
