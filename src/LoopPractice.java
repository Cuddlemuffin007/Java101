import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("\nThis program uses three different loops to display integers from -10 to 5.");
		System.out.println("\nBy default, integers are displayed in ascending order. Enter 'D' for descending order");
		String choice = a.nextLine();
		
		if (choice.equals("D")) {
			//for loop
			System.out.println("\nfor loop printing 5 to -10");
			
			for (int i = 5; i > -11; i--) {
				System.out.println("i = " + i);
			}//end for loop
			
			//while loop
			System.out.println("while loop printing 5 to -10");
			
			int x = 5;
			
			while (x > -11) {
				System.out.println("x = " + x);
				x--;
			}//end while loop
			
			//do-while loop
			
			System.out.println("do-while loop printing 5 to -10");
			
			int k = 5;
			
			do {
				System.out.println("k = " + k);
				k--;
			} while (k > -11);
			//end do-while loop
		} else {
		
			//for loop
			System.out.println("\nfor loop printing -10 to 5");
		
			for (int i = -10; i < 6; i++) {
				System.out.println("i = " + i);
			}//end for loop
		
			//while loop
			System.out.println("while loop printing -10 to 5");
		
			int x = -10;
		
			while (x < 6) {
				System.out.println("x = " + x);
				x++;
			}//end while loop
		
			//do-while loop
		
			System.out.println("do-while loop printing -10 to 5");
		
			int k = -10;
		
			do {
				System.out.println("k = " + k);
				k++;
			} while (k < 6);
			//end do-while loop
		}
		
	}
}