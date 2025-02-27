import java.awt.*;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.BitstreamFactory;
import javazoom.jl.decoder.BitstreamIOException;
import javazoom.jl.decoder.BitstreamUnknownException;
import javazoom.jl.decoder.Bitstream;

// Make sure to import the JLayer library if it's downloaded

public class Ball
{
    private int xLoc, yLoc, diameter; //initial location and size
    private int xStep, yStep; // movement offset
    private Color ballColor;
    private Player boomPlayer; // Player for MP3 sound
    
    /**
     * Default Constructor
     * creates a black ball @ (0,0)
     * with diameter of 10 and xStep= 5
     * yStep = 3 using other constructor (this)
     */
    public Ball(int x, int y, Color c)
    {
        this(x, y, 10, 5, 4, c);
    }
    
    /**
     * Constructor - sets all the instance vars
     * @param x - x position
     * @param y - y position
     * @param d - diameter
     * @param xMove - x translation
     * @param yMove - y translation
     * @param c - Color of Ball
     */
    public Ball(int x, int y, int d, int xMove, int yMove, Color c)
    {
        xLoc = x;
        yLoc = y;
        diameter = d;
        xStep = xMove;
        yStep = yMove;
        ballColor = c;

        // Initialize the MP3 player for the sound
        try {
            File soundFile = new File("boom.mp3"); // Ensure you have the "boom.mp3" file in the project directory
            boomPlayer = new Player(new FileInputStream(soundFile)); // Initialize JLayer Player
        } catch (FileNotFoundException | BitstreamException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Move the ball around the screen bouncing off walls
     * @param width  - width of screen
     * @param height - height of screen
     */
    public void move(int width, int height)
    {
        int radius = diameter / 2;

        // bounce off wall according to the law of elastic collision
        if (Math.abs(xLoc + xStep) + radius > width) {
            xStep = -xStep;
            playBoomSound(); // Play sound when bouncing off the horizontal wall
        }
        if (Math.abs(yLoc + yStep) + radius > height)  {
            yStep = -yStep;
            playBoomSound(); // Play sound when bouncing off the vertical wall
        }
        
        xLoc += xStep; // move the location of the ball
        yLoc += yStep;
    }
    
    /**
     * Play the "boom" sound when the ball hits a wall
     */
    private void playBoomSound()
    {
        try {
            if (boomPlayer != null) {
                boomPlayer.close(); // Stop previous sound if still playing
                boomPlayer = new Player(new FileInputStream("boom.mp3"));
                boomPlayer.play(); // Play the sound
            }
        } catch (FileNotFoundException | BitstreamException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Draw the ball on the screen at its current position and color
     */
    public void drawBall()
    {  
        // draw ball on the screen
        StdDraw.setPenColor(ballColor);
        StdDraw.filledCircle(xLoc, yLoc, diameter / 2);  
    }

    // Getters and Setters for all the instance variables
    public int getX()
    {
        return xLoc;
    }

    public int getY()
    {
        return yLoc;
    }

    public int getDiam()
    {
        return diameter;
    }

    public void setDiam(int d)
    {
        diameter = d;
    }

    public void setColor(Color c)
    {
        ballColor = c;
    }

    public Color getColor()
    {
        return ballColor;
    }

    public void setxLoc(int xLoc)
    {
        this.xLoc = xLoc;
    }

    public void setyLoc(int yLoc)
    {
        this.yLoc = yLoc;
    }

    public void setxStep(int xStep)
    {
        this.xStep = xStep;
    }

    public void setyStep(int yStep)
    {
        this.yStep = yStep;
    }

    public int getxStep()
    {
        return xStep;
    }

    public int getyStep()
    {
        return yStep;
    }
}
