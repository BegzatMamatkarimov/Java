package absrtact;

public class Triangle extends Shape{
    double x;
    double y;
    double z;

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void colculate() {
        double p = (x + y + z) / 2;
        System.out.println(Math.sqrt(p * (p - x) * (p - y) * (p - z)));
    }
}
