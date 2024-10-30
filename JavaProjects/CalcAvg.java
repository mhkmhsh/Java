import java.util.Scanner;

public class CalcAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        
        System.out.println("Please input numbers to calculate the average. Enter -1 to finish:");

        while (true) {
            int input = scanner.nextInt();
            
            if (input == -1) {
                break;
            }

            sum += input; 
            count++;
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("The average of the entered numbers is:"+ average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
