
import java.awt.*;

public class RoundBall extends Ball {

    private int x, y; 
    private int centerX, centerY; 
    private int radius;
    private double angle = 0; 
    private Timer timer;


    public RoundBall(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        super(c);
        StdDraw.fillOval(x - 10, y - 10, 20, 20);
        StdDraw.setColor(Color.RED);
        x = (int) (centerX + radius);
        y = centerY;
        timer = new Timer(20, this);
        timer.start();
    }

    public void move(int width, int height)
    {
        angle += 0.02;
        if (angle > 2 * Math.PI) {
            angle -= 2 * Math.PI;
        }

        x = (int) (centerX + radius * Math.cos(angle));
        y = (int) (centerY + radius * Math.sin(angle));

     
        
        
    }

}
