import java.awt.*;

public class Thirdball extends Ball{
    private int radius;
    public Thirdball(double x, double y, double radius, Color c) {
        super(x, y, c);
this.radius=radius;

public void Thirdball(){
    StdDraw.setPenColor(getColor());
    StdDraw.filledSquare(getX(), getY(), radius);
}

    }

   
}
