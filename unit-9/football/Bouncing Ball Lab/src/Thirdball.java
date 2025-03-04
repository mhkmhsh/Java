import java.awt.*;

public class Thirdball extends Ball {

    private int radius;

    public Thirdball(int x, int y, Color c, int radius) {
        super(x, y, c);
        this.radius = radius;
    }

    public void drawBall() {
        StdDraw.setPenColor(getColor());
        StdDraw.filledSquare(getX(), getY(), radius);
    }
}
