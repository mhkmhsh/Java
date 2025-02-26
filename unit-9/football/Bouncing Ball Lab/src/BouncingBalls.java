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