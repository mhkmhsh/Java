import java.awt.*;


/**
 * Creates a ball object that bounces off
 * the walls
 * 
 * @author kimberly.jans
 * @version March 29, 2018
 *
 */
public class Ball
{
    private int xLoc, yLoc, diameter; //initial location and size
    private int xStep, yStep; // movement offset
    private Color ballColor;
    
    /**
     * Default Constructor
     * creates a black ball @ (0,0)
     * with diameter of 10 and xStep= 5
     * yStep = 3 using other constructor (this)
     */
  public Ball(int x, int y, Color c)
    {
        this(x,y,10,5,4,c);
        this(0,0,10,5,3,Color.black);
    }
    
    /**
     * Constructor
     * @param x - x position
     * @param y - y position
     * @param c - color of ball
     * with diameter of 10 and xStep= 5
     * yStep = 3 using other constructor (this)
     */
  //  public Ball(int x, int y,  Color c)
  //  {
  //     
   // }
    
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
    }
    

    
    /**
     * move the ball around the screen bouncing off walls
     * @param width  - width of screen
     * @param height - height of screen
     */
    public void move(int width, int height)
    {
        int radius = diameter/2;

     // bounce off wall according to law of elastic collision
        if (Math.abs(xLoc + xStep) + radius > width) {
            xStep = -xStep;
            StdAudio.play("pong.wav");
        }
        if (Math.abs(yLoc + yStep) + radius > height)  {
            yStep = -yStep;
            StdAudio.play("pong.wav");
        }
        
        xLoc += xStep; //move the location of ball
        yLoc += yStep;
        
        
    }
    
    /**
     * Draw the ball on the screen at its current position and color
     */
    public void drawBall()
    {  
            // draw ball on the screen
            StdDraw.setPenColor(ballColor);
            StdDraw.filledCircle(xLoc, yLoc, diameter/2);  
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
    
  
	/**
	 * @param xLoc the xLoc to set
	 */
	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	/**
	 * @param yLoc the yLoc to set
	 */
	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	/**
	 * @param xStep the xStep to set
	 */
	public void setxStep(int xStep) {
		this.xStep = xStep;
	}

	/**
	 * @param yStep the yStep to set
	 */
	public void setyStep(int yStep) {
		this.yStep = yStep;
	}

	/**
	 * @return the xStep
	 */
	public int getxStep() {
		return xStep;
	}

	/**
	 * @return the yStep
	 */
	public int getyStep() {
		return yStep;
	}
        
}