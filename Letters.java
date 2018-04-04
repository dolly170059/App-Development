// Recursion Puzzle Solution 2
	//@author 
	// 04/04/2018  v1.0
	package RecursionPuzzle;
	import java.util.Scanner;

	public class Letters {
	private static String letter(char charac) {
			
			result= charac + result;
			if (charac == 'a') return result;
			
			return letter(--charac);
		    
		}

		static String result = "";
		public static void main(String[] args) {
			char nth_char;
			//Scanner class for reading the input
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter the nth character from a to z : ");
			nth_char = keyboard.next().charAt(0);
			
			System.out.println("");		
			System.out.println("String :" + letter(nth_char));
			
			keyboard.close();
			
		}
	}

