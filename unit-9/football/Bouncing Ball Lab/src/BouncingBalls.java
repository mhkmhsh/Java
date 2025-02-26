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
import java.awt.Color;


public class BouncingBalls {

    private Ball[] balls;
    private int width, height;

    public BouncingBalls(int w, int h)
    {
        width = w;
        height = h;
        balls = new Ball[1];
        balls[0] = new Ball(50,50,Color.RED);
       
        
    }


    public void moveBalls()
    {
        for(Ball b: balls)
            b.move(width, height);
    }

    public void drawBalls()
    {  
        for(Ball b: balls)
            b.drawBall(); 

    }


    public static void main(String[] args) {

        // initialize standard drawing
        StdDraw.setXscale(-250, 250);
        StdDraw.setYscale(-250, 250);
        StdDraw.enableDoubleBuffering(); //smooths animation performation
        BouncingBalls court = new BouncingBalls(250,250);
        while (true)   //bounce forever
        { 
            court.drawBalls();

            // display and pause for 50 ms
            StdDraw.show();
            StdDraw.pause(50); // this controls speed
            court.moveBalls();
            // set the background to light gray to erase
            StdDraw.clear(StdDraw.LIGHT_GRAY); //set every pixel
        } 


    }

}
BouncingBalls.java
Whoops! There was a problem previewing Bouncing Ball Lab Installation Guide Visual Studio. Retrying.