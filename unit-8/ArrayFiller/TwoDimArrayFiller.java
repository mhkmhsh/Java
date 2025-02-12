

public class TwoDimArrayFiller {


	public static void main(String[] args) {

		example_one();
		example_two();

		part1();
	    part2();
		part3();
		part4();
	    part5();
	    part6();
		//part7();
		//part8();

	}
	public static void part1() {
		int [][] a = new int[4][5];

		for(int r = 0; r<a.length; r++){
            for(int c= 0; c<a[r].length; c++){
                a[r][c] = r ;
            }
        }

		System.out.println("\n****in part1() method****");
		print2D_array(a);
	}
	public static void part2() {
		int [][] a = new int[4][5];
		
		for(int r = 0; r<a.length; r++){
            for(int c= 0; c<a[r].length; c++){
                a[r][c] = c ;
            }
        }
		System.out.println("\n****in part2() method****");
		print2D_array(a);
	}
    public static void part3() {
        int [][] a = new int[4][5];
        int count = 20;
        for(int r = 3; r >= 0; r--){  
            for(int c = 0; c < a[r].length; c++){
                a[r][c] = count--;  
            }
        }
        System.out.println("\n****in part3() method****");
        print2D_array(a); 
    }
    public static void part4() {
        int [][] a = new int[4][5];
        int count = 1;
        for(int r = a.length-1; r >= 0; r--){  
            for (int c = 0; c < a[r].length; c++) {
                a[r][c] = count;  
                count++;  
                
            }
           
        }
      
        System.out.println("\n****in part4() method****");
        print2D_array(a); 
    }
    
	
    public static void part5() {
        int [][] a = new int[4][5];
        int num = 20; 
    
        for(int r = 0; r < a.length; r++) {
            for(int c = 0; c < a[r].length; c++) {
                a[r][c] = num--; 
            }
        }
    
        System.out.println("\n****in part5() method****");
        print2D_array(a); 
    }
    
    public static void part6() {
        int [][] a = new int[4][5];
        int num = 1; 
    
        for(int r = 0; r < a.length; r++) {
            for(int c = 0; c < a[r].length; c++) {
                a[r][c] = num++; 
            }
        }
    
        System.out.println("\n****in part6() method****");
        print2D_array(a); 
    }
    

	
	public static void example_one() {
		int [][] a = new int[4][5];
		int count = 1;
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				a[row][col] = count;
				count++;
			}
		}
		System.out.println("\n****in example_one() method****");
		print2D_array(a);
	}
	public static void example_two() {
		int [][] a = new int[4][5];
		int count = 1;
		for(int col = 0; col < a[0].length; col++) {
			for(int row = a.length - 1; row >= 0; row--) {

				a[row][col] = count;
				count++;
			}
		}
		System.out.println("\n****in example_two() method****");
		print2D_array(a);
	}
	public static void print2D_array(int [][] arr) {

		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}
}