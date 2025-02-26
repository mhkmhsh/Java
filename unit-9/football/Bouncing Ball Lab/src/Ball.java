Skip to main content
Google Classroom
Classroom
AP Computer Science A P1 2024-2025
Ms. Rehwinkel P 1
Stream
Classwork
People
AP Computer Science A P1 2024-2025
Ms. Rehwinkel P 1
Upcoming
Due tomorrow
CS Awesome 9.5

Announce something to your class

Announcement: "Notes for Wednesday 2/26"
Christine Rehwinkel
Created 8:03 AM8:03 AM
Notes for Wednesday 2/26

Unit 9 - Inheritance Day4.pdf
PDF

Ball.java
Java

BouncingBalls.java
Java

pong.wav
Audio

stdlib.jar
Unknown

Bouncing Ball Lab Installation Guide Visual Studio
Google Docs

Add class comment…


Announcement: "Notes for Monday 2/24"
Christine Rehwinkel
Created Feb 24Feb 24 (Edited Feb 24)
Notes for Monday 2/24

Unit 9 - Inheritance Day3.pdf
PDF

Unit 9 - Inheritance Day3 solutions.pdf
PDF

Add class comment…


Announcement: "Notes for Friday 2/21 (Period 1) and…"
Christine Rehwinkel
Created Feb 21Feb 21 (Edited Feb 21)
Notes for Friday 2/21 (Period 1) and Monday 2/24 (Period 4)

Unit 9 - Inheritance Day2.pdf
PDF

LegalSecretary.java.txt
Text

Lawyer.java.txt
Text

EmployeeTester2.java
Java

Unit 9 - Inheritance Day2 solutions.pdf
PDF

Add class comment…


Announcement: "Notes for Wednesday 2/19"
Christine Rehwinkel
Created Feb 19Feb 19
Notes for Wednesday 2/19

EmployeeTester.java
Java

Employee.java.txt
Text

Secretary.java.txt
Text

Unit 9 - Inheritance Day1.pdf
PDF

Add class comment…


Announcement: "Notes for Friday 2/14 - Test on Unit 8…"
Christine Rehwinkel
Created Feb 14Feb 14
Notes for Friday 2/14 - Test on Unit 8 is on Tuesday 2/18

Unit 8 2D arrays Day 9.pdf
PDF

Add class comment…


Announcement: "Notes for Wednesday 2/12"
Christine Rehwinkel
Created Feb 12Feb 12
Notes for Wednesday 2/12

Unit 8 2D arrays Day 7.pdf
PDF

TwoDimArrayFiller.java
Java

Add class comment…


Announcement: "Notes for Tuesday 2/11"
Christine Rehwinkel
Created Feb 11Feb 11 (Edited Feb 11)
Notes for Tuesday 2/11

Unit 8 2D arrays Day 6.pdf
PDF

SeatingChart Starter Code.txt
Text

Student.java
Java

Unit 8 2D arrays Day 6 solutions.pdf
PDF

Add class comment…


Announcement: "Garden State CTF - Jan. 24 - 28th - let…"
Christine Rehwinkel
Created Feb 10Feb 10
Garden State CTF - Jan. 24 - 28th - let me know if you want to compete by 2/17. 
 practice resources in attached doc

Garden State CTF Resource Guide
Google Docs

Add class comment…


Announcement: "Notes for Friday 2/7"
Christine Rehwinkel
Created Feb 7Feb 7 (Edited Feb 7)
Notes for Friday 2/7

Unit 8 2D arrays Day 5.pdf
PDF

Unit 8 2D arrays Day 5 solutions.pdf
PDF

Add class comment…


Announcement: "Notes for Thursday 2/6"
Christine Rehwinkel
Created Feb 6Feb 6 (Edited Feb 6)
Notes for Thursday 2/6

Unit 8 2D arrays Day 4.pdf
PDF

Candy.java
Java

BoxOfCandy - Starter Code.java
Java

Unit 8 2D arrays Day 4 solutions.pdf
PDF

Add class comment…

Stream
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
  //  public Ball()
 //   {
  //    
  //  }
    
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
Ball.java
Whoops! There was a problem previewing Bouncing Ball Lab Installation Guide Visual Studio. Retrying.