import java.awt.*;

public class Thirdball extends Ball {

    private int radius;

    public Thirdball(double x, double y, Color c, int radius) {
        super(x, y, c);
        this.radius = radius;
    }

    public void draw() {
        StdDraw.setPenColor(getColor());
        StdDraw.filledSquare(getX(), getY(), radius);
    }
}
