
import java.util.Scanner;

public class OddsAndEvens
{
	// this method returns how many elements in array are odd
	//  when odd is true. When odd is false, it returns how many
	//  elements are even.
	private static int countEm(int[] array, boolean odd)
	{
return null;
    }
	
	// use the method countEm in the next two methods
	public static int[] getAllEvens(int[] array)
	{
        for (int arr : array) {
            if (arr/2 == 0) {
              ev++;
              odd=false;
          }
    
      return ev;
	}

	public static int[] getAllOdds(int[] array)
	{
		int count = 0;
      
        for (int arr : array) {
              if (arr/2 != 0) {
                count++;
                odd=true;
            }
      
        return count;
	}		
	}
}