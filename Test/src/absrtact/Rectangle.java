package absrtact;

public class Rectangle extends Shape{
    double x;
    double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void colculate() {
        System.out.println(x * y);
    }
}
