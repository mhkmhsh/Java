import java.util.Scanner;

public class Tca1_review {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Town you live in: "); 
        String town = scan.nextLine(); 
        System.out.print("Enter your birth year: "); 
        int year = scan.nextInt(); 
        String morganville = "07751"; 
        String marlboro = "07746";

       
        if (town.equals("Morganville")|| town.equals("morganville" )) {
            System.out.println("Your Zip is " + morganville);
        } else if (town.equals("Marlboro") || town.equals("marlboro")) {
            System.out.println("Your Zip is " + marlboro);
        } else {
            System.out.println("Unknown Zipcode");
        }
         int currentYear = 2024;
        int currentAge = currentYear - year;
          int thirty = 30 - currentAge;
          int yearThirty = thirty + currentYear;
        if(currentAge < 30){
            System.out.print("You turn 30 in: ");
         System.out.println(yearThirty);
        }
        else{
            System.out.println(" You are already thirty!");
        }
       
    }
}
