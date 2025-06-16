import java.util.Scanner;

public class Player {
    private String name;
    private int totalScore;

    public Player(String name) {
        this.name = name;
        this.totalScore = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return totalScore;
    }

    public boolean takeTurn() {
        Scanner scanner = new Scanner(System.in);
        int turnTotal = 0;
        boolean continueTurn = true;

        while (continueTurn) {
            int roll = rollDice();
            System.out.println(name + " rolled: " + roll);

            if (roll == 1) {
                System.out.println("Bust! Better luck next turn.");
                turnTotal = 0;
                break; // End turn
            } else {
                turnTotal += roll;
                System.out.println("Current turn total: " + turnTotal);
                System.out.print("Do you want to roll again? (y/n): ");
                String choice = scanner.nextLine();

                if (!choice.equalsIgnoreCase("y")) {
                    break; // End turn and keep points
                }
            }
        }

        totalScore += turnTotal;
        System.out.println(name + "'s total score: " + totalScore);
        return true; // Turn is over, next player should go
    }

    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
