import java.awt.Color;


public class BouncingBalls {

    private Ball[] balls;
    private int width, height;

    public BouncingBalls(int w, int h)
    {
        width = w;
        height = h;
        balls = new Ball[9];
        balls[0] = new Ball(100,50,Color.BLUE);
        balls[1] = new Ball(50,0,Color.RED);
        balls[2] = new Ball(0,0,Color.MAGENTA);
        balls[3] = new Ball(100,100,Color.YELLOW);
        balls[4] = new Ball(100,0,Color.PINK);
        balls[5] = new Ball(10,5,Color.BLUE);
        balls[6] = new Ball(50,20,Color.RED);
        balls[7] = new Ball(30,40,Color.MAGENTA);
        balls[8] = new Ball(20,130,Color.YELLOW);
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
            StdDraw.pause(10); // this controls speed
            court.moveBalls();
            // set the background to light gray to erase
            StdDraw.clear(StdDraw.BLACK); //set every pixel
        } 


    }

}