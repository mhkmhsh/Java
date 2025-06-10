import java.util.*;
public class PlayPig {
    public static void main(String[] args) {
     welcome();
     play();
     displayScoreBoard();
    }
    public static void welcome(){
        System.out.println("Welcome to the game, roll to start");
    }
    public static play(){
Scanner inp = new Scanner(System.in);
        String p1 = inp.nextLine();
        System.out.println("Player 1 is: " + p1);
        String p2 = inp.nextLine();
        System.out.println("Player 2 is: " + p2);

    }
    public static displayScoreBoard(){
        System.out.println(" Player One's total score is: " + totalScore );
        System.out.println(" Player Two's total score is: " + totalScore );
        if (p1>p2){
            System.out.println("Player One is the Winner!")
        }
        else{
            System.out.println("Player Two is the Winner!")
        }
    }
   }



























