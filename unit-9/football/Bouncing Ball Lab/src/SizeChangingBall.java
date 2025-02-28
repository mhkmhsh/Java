import java.awt.*;

public class SizeChangingBall extends Ball{

    private int maxDiameter, minDiameter;
    private int diameterStep;

    public sizeChangingBall(int xStart, int yStart, Color c, int) {
        super(xStart, yStart, c);
        maxDiameter = maxD;
        minDiameter =2;
        diameterStep =1;


    public void changeDiameter() {
        int diam = getDiam();
        dian += diameterStep;
        if (diam >= maxDiameter || diam <= minDiameter) {
            diameterStep = -diameterStep;
        }
        setDiam(diam);
    }
 public void move(int width, int height){
    Superclass.move(width,height);
    changeDiameter();
 }
}
}
