import java.awt.*;

public class ColorfulBall extends Ball{
    Color[] ballColors = { Color.red, Color.blue, Color.black, Color.green, Color.cyan, Color.magenta};
int colorNum;
public ColorfulBall(int x, int y, int d, int xMove, int yMove){
    super(x,y,d, xMove, yMove, Color.red);
    colorNum = 0;
}
public void move(int width, int height){
    colorNum++;
    setColor(ballColors[colorNum % ballColors.length]);
    super.move(width,height);
}
}