package YouTube;

public class Rectangle implements Drawable{
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("▬ ");
            }
            System.out.println();
        }
    }

}
