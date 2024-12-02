public class Snowman {
       public static Snowman {
    private int x;
    private int y;
   private String pictureFile;
   private String name;
       }
       public snowman(double x, double y, String pictureFile, String name){
 this.x = x;
 this.y = y;
 this.pictureFile = pictureFile;
 this.name = name;
       }

     public move(){
        x = x + (Math.random()*8);
   }
 public getName (){
    return name;
 }
 public getX(){
    return:x;
 }
 public draw(){
    StdDraw.picture(x, y, pictureFile, 50, 60);
 }
}