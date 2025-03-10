import java.awt.Color;


public class BouncingBalls {

    private Ball[] balls;
    private int width, height;

    public BouncingBalls(int w, int h)
    {
        width = w;
        height = h;
        balls = new Ball[5];
        balls[0] = new SoundBall(50,30,Color.RED,10);
        balls[1] = new Ball(100,50,Color.BLUE);
        balls[2] = new ColorfulBall(10,10,20,-5,8);
        balls[3] = new SizeChangingBall(200,200,Color.CYAN, 50);
        balls[4] = new Thirdball(20,20,Color.GREEN, 2);
        //balls[5] = new RoundBall(10, 10, Color.YELLOW, 5);
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