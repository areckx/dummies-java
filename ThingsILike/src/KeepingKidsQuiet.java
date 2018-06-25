import java.util.Scanner;


public class KeepingKidsQuiet {

	public static void divideGumballs() { 
		Scanner howMany = new Scanner(System.in);
	
		int gumballs;
		int kids;
		int gumballsPerKid;
		
		// Separate by a blank space
		System.out.print("How many gumballs? How many kids? ");
		
		gumballs = howMany.nextInt();
		kids = howMany.nextInt();
		
		gumballsPerKid = (gumballs / kids);
		
		System.out.print("Each kid gets ");
		System.out.print(gumballsPerKid);
		System.out.println(" gumballs.");
	}
}
