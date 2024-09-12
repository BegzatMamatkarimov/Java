package YouTube;

public class Triangl implements Drawable{
    private int side;

    public Triangl(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = side - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i*2 +1; j++) {
                System.out.print("0 ");

            }
            System.out.println();
        }

    }
}
