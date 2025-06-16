import java.util.Scanner;

public class PlayPig {
    static Player player1;
    static Player player2;

    public static void main(String[] args) {
        welcome();
        playGame();
        displayScoreBoard();
    }

    public static void welcome() {
        System.out.println(" Welcome to the Pig Dice Game!");
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for Player 1: ");
        player1 = new Player(scanner.nextLine());

        System.out.print("Enter name for Player 2: ");
        player2 = new Player(scanner.nextLine());

        boolean gameOn = true;
        int winningScore = 100;
        Player currentPlayer = player1;
        Player nextPlayer = player2;

        while (player1.getScore() < winningScore && player2.getScore() < winningScore) {
            System.out.println("It’s  " + currentPlayer.getName() + "'s turn:");
            currentPlayer.takeTurn();

            // Switch turns
            Player temp = currentPlayer;
            currentPlayer = nextPlayer;
            nextPlayer = temp;
        }
    }

    public static void displayScoreBoard() {
        System.out.println(" Final Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player" + player1.getName() + " wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Player " + player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}

