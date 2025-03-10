
import java.awt.*;

public class RoundBall extends Ball {

    private double x0, y0, x1, y1;
    private double ballRadius;

    public LineWithBall(double x0, double y0, double x1, double y1, double ballRadius) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.ballRadius = ballRadius;
    }

    public RoundBall(int x, int y, Color c, int radius) {
        super(x, y, c);
        this.radius = radius;
    }

    public void drawBall() {
        StdDraw.line(new Line2D.Double(x0, y0, x1, y1));;
        StdDraw.setPenColor(getColor());
        StdDraw.fillOval((int) (x0 - ballRadius), (int) (y0 - ballRadius), (int) (2 * ballRadius), (int) (2 * ballRadius));;

    }

   

    public void move(int width, int height) {
        LineWithBall line = new LineWithBall(100, 50, 200, 150, 20);

    }

}
