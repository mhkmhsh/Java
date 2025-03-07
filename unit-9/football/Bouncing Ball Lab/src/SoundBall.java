
import java.awt.*;

public class SoundBall extends Ball {

    private int xLoc, yLoc, diameter;
    private int xStep, yStep;
    public SoundBall

    {
        xLoc = x;
        yLoc = y;
        xStep = xMove;
        yStep = yMove;

    }

    public void move(int width, int height) {

        int radius = diameter / 2;
        if (Math.abs(xLoc + xStep) + radius > width) {
            xStep = -xStep;
            StdAudio.play("car.wav");
        }
        if (Math.abs(yLoc + yStep) + radius > height) {
            yStep = -yStep;
            StdAudio.play("car.wav");
        }

    }

}
