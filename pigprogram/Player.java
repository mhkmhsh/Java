import java.util.Scanner;

public class Player extends PlayPig {
    private String name;
    private int totalScore;
    public String getName(){
        return name;
    }
    public int getScore(){
        return totalScore;
    }

   public Player(String name){
        this.name = name;
        this.totalScore = 0;
    }
    public void takeTurn(){
         Scanner one = new Scanner(System.in);
         System.out.println("Type any letter to roll the dice: ");
         one.nextLine();
         /* gen a random number, 
         tell user current round total
         prompt roll again or no
        get out if roll 1 or say no */
        int currRoundTot = 0;
        while( true ){
            if(roll!= 1){
                currRoundTot = roll + currRoundTot;
            }
        }
    }
}
