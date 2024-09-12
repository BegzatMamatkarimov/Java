package Lab4;

public class main {
    public static void main(String[] args) {
        User[] users = new User[5];

        Staff staff1 = new Staff(1, "login1", "123456", "name1", "surname1", 1000);
        staff1.addSubject("matem");
        staff1.addSubject("Fizra");
        users[0] = staff1;
        Staff staff2 = new Staff(2, "login2", "123456", "name2", "surname2", 2000);
        staff2.addSubject("Tarix");
        users[1] = staff2;

        Student student1 = new Student(3, "login3", "123456", "name3", "surname3", 4);
        student1.addCourse("eng");
        student1.addCourse("rus");
        users[2] = student1;

        Student student2 = new Student(4, "login4", "123456", "name4", "surname4", 3);
        student2.addCourse("math");
        student2.addCourse("fiz");
        users[3] = student2;

        User user = new User(4, "login4", "123456", "name4", "surname4");
        users[4] = user;

        for (User user1 : users) {
            user1.getData();
        }

    }
}
