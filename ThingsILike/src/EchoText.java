/**
 * Accepts input from keyboard. * 
 * 
 * @author Barry Burd
 */

/* areckx: 
 * I am changing the program to be called on CallTheThings as a main.
 * In case I want to expand the class to include more functions, I am naming it
 * EchoText and does work with text in general
 * 
 * I am also taking liberties with the variable names and other misc. things. I believe
 * the author of the book intended readers to play around with his code, but it doesn't
 * hurt to include his name on the source code.
 */

import java.util.Scanner;

public class EchoText {

	/* areckx: Memory Leaks
	 * Apparently without declaring `readTextInput` as static, it will
	 * cause `readTextInput` to not close at the end of the function call
	 */
	private static Scanner readTextInput;
	//private static Scanner grep;
	/**
	 * <p>echoLine</p> After pressing Enter, an exact copy is displayed on a newline.
	 */
	public static void echoLine() {
		System.out.print("echoLine: ");
		readTextInput = new Scanner(System.in); 

		System.out.println(readTextInput.nextLine());
	} 
	
	/**
	 * <p>firstWord</p> After pressing Enter, an exact copy of the first word is displayed
	 * on a newline.
	 */
	public static void firstWord() {
		System.out.print("firstWord: ");
		readTextInput = new Scanner(System.in);
		
		System.out.println(readTextInput.next());
	}
	
	public static void plainInt() { 
		System.out.print("plainInt: ");

		readTextInput = new Scanner(System.in); 

		
		while(true) {

			if (readTextInput.hasNextInt()) {
				System.out.println(readTextInput.nextInt()); 
				
				break;

			} else { 
			System.out.println("Please enter a number.");
			System.out.print("plainInt: "); 

			readTextInput = new Scanner(System.in); 
			}
		} 
	}

	/* areckx: !TODO! Get the logic of this all sorted out
	 *	
	 * I'm mostly playing around with how to implement the various methods in Scanner
	 * and adding some ideas in there. Basically, this method needs to ask for 
	 * 		
	 * 		1. A sentence to parse
	 * 
	 * 		2. A string to isolate within the above sentence	
	 * 
	 * There is also a strange behavior in the print() messages which causes the first
	 * one to print a new line and go straight to printing the second one while the 
	 * first Scanner call is still being performed.
	 */

	/*
	public static void grepChar() { 
	
		System.out.print("grepChar(sentence): "); 
		readTextInput = new Scanner(System.in); 
	
		System.out.print("\ngrepChar(char to grep): "); 
		grep = new Scanner(System.in); 
		
		System.out.println(readTextInput.findInLine(grep.nextLine()));
	
	}
	*/
}
