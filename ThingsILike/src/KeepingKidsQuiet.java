import java.util.Scanner;


public class KeepingKidsQuiet {

	public static void divideGumballs() { 
		Scanner howMany = new Scanner(System.in);
	
		int gumballs;
		int kids;
		int gumballsPerKid;
		
		System.out.print("How many gumballs?"); 
		gumballs = howMany.nextInt();
		
		System.out.print("\nHow many kids? ");
		kids = howMany.nextInt();
		
		gumballsPerKid = (gumballs / kids);
		
		System.out.print("Each kid gets ");
		System.out.print(gumballsPerKid);
		System.out.println(" gumballs.");
	}
}
