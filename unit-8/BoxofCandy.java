import java.lang.reflect.Array;
import java.util.Arrays;

public class BoxOfCandy
{
  /** box contains at least one row and is initialized in the constructor. */
  private Candy[][] box;

  public BoxOfCandy(int rows, int cols)
  {
    box = new Candy[rows][cols];
  }

  public void add(Candy candy, int row, int col)
  {
    box[row][col] = candy;
  }

  /******************  Part (a) ******************/
  
  /**
   * Moves one piece of candy in column col, if necessary and possible, so that the box
   * element in row 0 of column col contains a piece of candy, as described in part (a).
   * Returns false if there is no piece of candy in column col and returns true otherwise.
   * Precondition: col is a valid column index in box.
   */

  public boolean moveCandyToFirstRow(int col)
  {
    for(int row = 0; row < box.length; row++) {
        if (box[row][col] != null) {  
           
            box[0][col] = box[row][col];
            box[row][col] = null;  
            return true;
        }
    }
  
    return false;
  }
  
  /******************  Part (b) ******************/
  
  /**
   * Removes from box and returns a piece of candy with flavor specified by the parameter, or
   * returns null if no such piece is found, as described in part (b)
   */
  public Candy removeNextByFlavor(String flavor)
  {
 
  }

/******************  Tests ******************/

  public String toString()
  {
    String  s = "";
    
    for (int row = 0; row < box.length; row++)
    {
      for( int col =0; col < box[row].length; col++)
        s += box[row][col] + " ";
      s += "\n";
    }
    return s;
  }
  
  public static void main(String[] args)
  {
    {
      BoxOfCandy box = new BoxOfCandy(4, 3);
      box.add(new Candy("lime"), 0, 1);
      box.add(new Candy("orange"), 1, 1);
      box.add(new Candy("cherry"), 2, 2);
      box.add(new Candy("lemon"), 3, 1);
      box.add(new Candy("grape"), 3, 2);
      System.out.println(box);
      System.out.println();
      for (int col= 0; col < 3; col++)
      {
        System.out.println("col = " + col + " moveCandyToFirstRow(col) = " + box.moveCandyToFirstRow(col));
        System.out.println(box);
        System.out.println();
      }
      System.out.println();
    }
    {
      BoxOfCandy box = new BoxOfCandy(3, 5);
      box.add(new Candy("lime"), 0, 0); 
      box.add(new Candy("lime"), 0, 1); 
      box.add(new Candy("lemon"), 0, 3); 
      box.add(new Candy("orange"), 1, 0); 
      box.add(new Candy("lime"), 1, 3); 
      box.add(new Candy("lime"), 1, 4); 
      box.add(new Candy("cherry"), 2, 0);
      box.add(new Candy("lemon"), 2, 2); 
      box.add(new Candy("orange"), 2, 4);
      System.out.println(box);
      System.out.println();
      
      String[] flavors = {"cherry", "lime", "grape"};
      for (int k = 0; k < 3; k++)
      {
        String flavor = flavors[k];
        System.out.println("flavor = " + flavor + "; removeNextByFlavor(flavor) = " + box.removeNextByFlavor(flavor));
        System.out.println(box); 
        System.out.println();
      }
    }  
  }
}