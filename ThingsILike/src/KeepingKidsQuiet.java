import java.util.Scanner;
import java.text.DecimalFormat;


public class KeepingKidsQuiet {
	
	private static DecimalFormat cents;
	private static Scanner howMany;

	public static void divideGumballs() { 
		cents = new DecimalFormat("0.00");
		howMany = new Scanner(System.in);
	
		int gumballs;
		int kids;
		int gumballsPerKid;

		double costOfGumballs;
		double totalPrice;
		
		// Separate by a blank space
		System.out.print("How many gumballs? How many kids? Cost of each gumball? ");
		
		gumballs = howMany.nextInt();
		kids = howMany.nextInt();
		costOfGumballs = howMany.nextDouble();
		
		totalPrice = ((double)gumballs * costOfGumballs);
		gumballsPerKid = (gumballs / kids);

		
		System.out.print("Each kid gets " + gumballsPerKid + " gumballs ");
		
		System.out.println("and it's gonna cost you $" + cents.format(totalPrice)
				+ " so no haircut for you.");
	}
}
