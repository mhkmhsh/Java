
import java.awt.*;


public class SoundBall extends Ball {

    public void move(int width, int height) {
        if (Math.abs(xLoc + xStep) + radius > width) {
            xStep = -xStep;
            StdAudio.play("car.wav");
        }
        if (Math.abs(yLoc + yStep) + radius > height)  {
            yStep = -yStep;
            StdAudio.play("car.wav");
        }
        
    }

}
