import java.util.Scanner;

public class ForLoopExercises {

    public static void main(String[] args) {
        System.out.println("Calling part1 method: ");
        part1();
        
        System.out.println("Calling part2 method: ");
        part2();
        
        System.out.println("\nCalling part3 method: ");
        part3();

        System.out.println("\nCalling part4 method: ");
        part4();
        
        System.out.println("\nCalling part5 method: ");
        part5();

        System.out.println("\nCalling part6 method: ");
        part6();
    }

    public static void part1(){
        System.out.println("Here are the integers from 1 to 200");
        for (int x = 1; x <= 200; x++) {
            System.out.println(x);
        }
    }

    public static void part2(){
        System.out.println("Here are the odd integers between 50 and 150");
        for (int x = 51; x <= 150; x += 2) {
            System.out.println(x);
        }
    }

    public static void part3(){
        System.out.println("Here are all the multiples of 4 between 4 and 200");
        for (int x = 4; x <= 200; x += 4) {
            System.out.println(x);
        }
    }

    public static void part4(){
        System.out.println("Here are all the multiples of 20 starting from 1000 and going down to 20");
        for (int x = 1000; x >= 20; x -= 20) {
            System.out.println(x);
        }
    }

    public static void part5(){
        System.out.println("The sum of all the numbers between 1 and 500 is: ");
        int sum = 0;
        for (int x = 1; x <= 500; x++) {
            sum += x;
        }
        System.out.println(sum);
    }

    public static void part6(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the starting integer: ");
        int y1 = scan.nextInt();
        System.out.print("Enter the ending integer: ");
        int y2 = scan.nextInt();
        
        int sum = 0;
        int count = 0;
        
        for (int x = y1; x <= y2; x++) {
            sum += x;
            count++;
        }
        
        double average = (count > 0) ? (double) sum / count : 0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
