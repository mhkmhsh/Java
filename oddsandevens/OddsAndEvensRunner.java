
import java.util.Arrays;

public class OddsAndEvensRunner {

    public static void main(String args[]) {
        //add test cases

        // create 3 arrays with the values
        // 2 4 6 8 10 12 14
        int[] one = {2, 4, 6, 8, 10, 12, 14};
        int[] oneEven = OddsAndEvens.getAllEvens(one);
        int[] oneOdd = OddsAndEvens.getAllOdds(one);
        System.out.println(Arrays.toString(one));
        System.out.println("even: " + Arrays.toString(oneEven));
        System.out.println("odd: =  " + Arrays.toString(oneOdd));
        // 1 2 3 4 5 6 7 8 9
        int[] two = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] twoEven = OddsAndEvens.getAllEvens(two);
        int[] twoOdd = OddsAndEvens.getAllOdds(two);
        System.out.println(Arrays.toString(two));
        System.out.println("even: " + Arrays.toString(twoEven));
        System.out.println("odd: =  " + Arrays.toString(twoOdd));
        // 2 10 20 21 23 24 40 55 60 61
        int[] three = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
        int[] threeEven = OddsAndEvens.getAllEvens(three);
        int[] threeOdd = OddsAndEvens.getAllOdds(three);
        System.out.println(Arrays.toString(three));
        System.out.println("even: " + Arrays.toString(threeEven));
        System.out.println("odd: =  " + Arrays.toString(threeOdd));
        // call all the methods in OddsAndEvens class
        // be sure to print out the results

    }
}
