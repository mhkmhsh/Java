
import java.util.Scanner;

public class Player {

    private String name;
    private int totalScore;

    public String getName() {
        return name;
    }

    public int getScore() {
        return totalScore;
    }

    public Player(String name) {
        this.name = name;
        this.totalScore = 0;
    }

    
    public void takeTurn() {
        Scanner one = new Scanner(System.in);
        System.out.println("Type any letter to roll the dice: ");
        one.nextLine();
        /* gen a random number, 
         tell user current round total
         prompt roll again or no
        get out if roll 1 or say no */
        int currRoundTot = 0;
     
        while (true) {
            int roll = (int) (Math.random() * 6) + 1;
        
            if (roll == 1 ) {
                currRoundTot = 0;
                System.out.println("Bust! you rolled a 1.");
                break;
            }

            System.out.println("You rolled a " + roll);
            currRoundTot = roll + currRoundTot;
            System.out.println("Do you want to roll again? ( y/n ): ");
            String ans = one.nextLine();
            if (ans.equals("n")){
                break;
            }

        }
        totalScore += currRoundTot;
        System.out.print("Your turn is over! your score is a: " + totalScore);

    }
}
