package absrtact;

public class Circle extends Shape{
    double d;

    public Circle(double d) {
        this.d = d;
    }

    @Override
    public void colculate() {
        System.out.println(Math.PI * Math.pow(d, 2));
    }
}
