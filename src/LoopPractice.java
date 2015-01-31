
public class LoopPractice {

	public static void main(String[] args) {
		
		//for loop
		System.out.println("for loop printing -10 to 5");
		
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
