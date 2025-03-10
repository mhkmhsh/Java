
import java.awt.*;

public class RoundBall extends Ball {

   
   private int radius;

    public RoundBall(int x, int y, Color c, int radius) {
        super(x, y, c);
        this.radius = radius;
        
    }

   

    public void move(int width, int height)
    {
        int radius = diameter/2;

  
        if (Math.abs(xLoc + xStep) + radius > width) {
            xStep = -xStep;
            StdAudio.play("pong.wav");
        }
        
        xLoc += xStep; 
        
        
    }

}
