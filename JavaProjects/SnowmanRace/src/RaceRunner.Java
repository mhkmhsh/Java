import java.awt.Font;


public class RaceRunner {
    static final int LIMIT = 500;
    public static void main(String[] args) {
        // Setup
        StdDraw.setCanvasSize(LIMIT, LIMIT);
        StdDraw.setXscale(0, LIMIT);
        StdDraw.setYscale(0, LIMIT);
        StdDraw.enableDoubleBuffering();


        Font font = new Font("Arial", Font.BOLD, 30);
        StdDraw.setFont(font);
        StdDraw.setTitle("Snowman Race");


      // create at least 2 instances/objects of a Snowman
      // The first snowman should be at x=10, y = 50
   
      // The second snowman should be at x=10, y = 150
      // The third snowman should be ???
      // ******  ADD CODE HERE *****
     

      Snowman s1 = new Snowman(10, 50,"cat_snowman.png","kitty");
      Snowman s2 = new Snowman(10, 150,"redhat_snowman.png","hat");

       // Main game loop
       while (true) {
        StdDraw.clear();

        // When the spacebar is pressed - make the snowmen move
        if (StdDraw.isKeyPressed(java.awt.event.KeyEvent.VK_SPACE)) {
            // call the move method on each snowman instance
            // ******  ADD CODE HERE *****
            s1.move();
            s2.move();
        }


        // call the draw method on each snowman
        // ******  ADD CODE HERE *****
        
        s1.draw();
        s2.draw();
        


        // check if there is a winner - they reached the edge of the canvas
       // ******  ADD CODE HERE *****
        if(s1.getX() >= LIMIT){
            StdDraw.text(LIMIT/2, LIMIT-70, s1.getName() + " WINS!!!");
        }
        if(s2.getX()  >= LIMIT){
            StdDraw.text(LIMIT/2, LIMIT-100, s2.getName() + " WINS!!!");
        }

        // Refresh screen
        StdDraw.show();
        StdDraw.pause(20);
    }
}
}
