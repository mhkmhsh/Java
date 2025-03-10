import java.awt.Color;

public class RoundBall extends Ball {

    private int centerX, centerY;
    private int radius;
    private double angle = 0;

    public RoundBall(int centerX, int centerY, Color c, int radius) {
        super(centerX + radius, centerY, 10, 0, 0, c);
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void move(int width, int height) {
        angle += 0.05;
        if (angle > 2 * Math.PI) {
            angle -= 2 * Math.PI;
        }

        setxLoc((int) (centerX + radius * Math.cos(angle)));
        setyLoc((int) (centerY + radius * Math.sin(angle)));
    }
}
