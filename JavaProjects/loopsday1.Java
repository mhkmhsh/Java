public class loopsday1 {
    public static void main(String [] args) {
        print200to300();
        printEvansto1000();
    }
  public static void print200to300(){
       int x = 200;
       while ( x<= 300) {
        System.out.println(x);
        x++; }
   }
public static void printEvansto1000(){
    int y = 0;
    while( y<= 1000) {
        System.out.println(y);
        y++;
        y++;
    }
}

}