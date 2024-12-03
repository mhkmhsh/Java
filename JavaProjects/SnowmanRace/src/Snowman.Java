public class Snowman {
    private int x;
    private int y;
   private String pictureFile;
   private String name;
       public Snowman(int x, int y, String pictureFile, String name){
 this.x = x;
 this.y = y;
 this.pictureFile = pictureFile;
 this.name = name;
       }

     public void move(){
        x += (int) (Math.random()*8) + 1;
   }
 public String getName(){
    return name;
 }
 public int getX(){
    return x;
 }
 public void draw(){
    StdDraw.picture(x, y, pictureFile, 50, 60);
 }
}