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

	/**
	 * <p>echoLine</p> After pressing Enter, an exact copy is displayed on a newline.
	 */
	public static void echoLine() {
		Scanner readTextInput = new Scanner(System.in); 

		System.out.println(readTextInput.nextLine());
	}

}
