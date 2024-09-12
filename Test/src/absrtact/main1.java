package absrtact;

public class main1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 5);
        Triangle triangle = new Triangle(3, 4, 5);

        circle.colculate();
        rectangle.colculate();
        triangle.colculate();
    }
}
