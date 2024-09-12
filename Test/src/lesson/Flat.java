package lesson;

public class Flat {
    String name;
    int price;
    int room;

    public Flat(String name, int price, int room) {
        this.name = name;
        this.price = price;
        this.room = room;
    }

    void getData(){
        System.out.println(name + " " + price + " " + room);
    }
}
