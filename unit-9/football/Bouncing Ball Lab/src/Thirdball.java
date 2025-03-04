
import java.awt.*;

public class Thirdball extends Ball {

    private int radius;

    public Thirdball(double x, double y, Color c, int radius) {
        super(x, y, c);
        this.radius = radius;


    public void Thirdball() {
        StdDraw.setPenColor(getColor());
        StdDraw.filledSquare(getX(), getY(), radius);
    }

}

}
