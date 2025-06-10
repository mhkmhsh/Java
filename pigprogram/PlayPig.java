import java.util.*;
public class PlayPig {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String p1 = inp.nextLine();
        System.out.println("Player 1 is: " + p1);
        String p2 = inp.nextLine();
        System.out.println("Player 2 is: " + p2);
    }
    public static void welcome(){
        System.out.println("Welcome to the game, roll to start");
    }
   public int firstRoll(){ 
    boolean p1Turn = true; 
    if ( p1Turn = true){
        int roll = (int)(Math.random() * 6) + 1;
         p1Turn = false;
    }
    else {
        int roll = (int)(Math.random() * 6) + 1;
        p1Turn = true;
    }
   }



























}