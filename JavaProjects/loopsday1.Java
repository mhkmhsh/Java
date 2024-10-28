public class loopsday1 {
    public static void main(String [] args) {
        print200to300();
        printEvansto1000();
        sum1to10();
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
public static void sum1to10(){
    int count = 1;
    int add = 2;
    while( count + add <= 10){
        System.out.println(add+count);
        add++;
    }
    }
}


}