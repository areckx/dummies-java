import java.util.Scanner;

public class ReverseWord {
	private static Scanner rev;

	public static void reverse() {
		rev = new Scanner(System.in);
		char c1, c2, c3, c4;

		c1 = rev.findInLine(".").charAt(0);
		c2 = rev.findInLine(".").charAt(0);
		c3 = rev.findInLine(".").charAt(0);
		c4 = rev.findInLine(".").charAt(0);

		System.out.print(c4);
		System.out.print(c3);
		System.out.print(c2);
		System.out.print(c1);
		System.out.println();
	}
}