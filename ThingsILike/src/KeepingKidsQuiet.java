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


	public static void makeChangeFromCents() {
		howMany = new Scanner(System.in);
		int quarters, dimes, nickels, cents;
		int whatsLeft, total;

		System.out.print("How many cents do you have? ");
		total = howMany.nextInt();

		quarters = (total / 25);
		whatsLeft = (total % 25);

		dimes = (whatsLeft / 10);
		whatsLeft = (whatsLeft % 10);

		nickels = (whatsLeft / 5);
		whatsLeft = (whatsLeft % 5);

		cents = whatsLeft;

		System.out.println();
		System.out.println("From " + total + " cents you get");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(cents + " cents");
	}

	public static void makeChangeFromDollars() {
		howMany = new Scanner(System.in);
		int quarters, dimes, nickels, cents;
		int whatsLeft, total;

		System.out.print("How many dollars do you have? ");
		total = howMany.nextInt() * 100;

		quarters = (total / 25);
		whatsLeft = (total % 25);

		// These will never return anything other than 0 since 4 quarters will always go into 1 dollar
		dimes = (whatsLeft / 10);
		whatsLeft = (whatsLeft % 10);

		nickels = (whatsLeft / 5);
		whatsLeft = (whatsLeft % 5);

		cents = whatsLeft;

		System.out.println();
		System.out.println("From " + (total / 100 ) + " dollars you get");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(cents + " cents");
	}

	public static void makeChange() {
		howMany = new Scanner(System.in);
		int quarters, dimes, nickels, cents;
		int whatsLeft, total;
		double totalDisplay;

		System.out.print("How much money do you have? (Example: 1.25) ");

		total = (int) (howMany.nextDouble() * 100);
		totalDisplay = ((double) total / 100);

		quarters = (total / 25);
		whatsLeft = (total % 25);

		// These will never return anything other than 0 since 4 quarters will always go into 1 dollar
		dimes = (whatsLeft / 10);
		whatsLeft = (whatsLeft % 10);

		nickels = (whatsLeft / 5);
		whatsLeft = (whatsLeft % 5);

		cents = whatsLeft;

		System.out.println();
		System.out.println("From $" + totalDisplay + " you get");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(cents + " cents");
	}

	public static void addMoreGumballs() {
		int gumballs = 27;

		++gumballs;
		System.out.println(gumballs);
		System.out.println(++gumballs);
		System.out.println(gumballs);
	}

	public static void gumballsAddMore() {
		int gumballs = 27;

		gumballs++;
		System.out.println(gumballs);
		System.out.println(gumballs++);
		System.out.println(gumballs);
	}

	public static void canIKeepKidsQuiet() {
		int gumballs, kids, gumballsPerKid;
		boolean eachKidGetsTen;

		gumballs = 140;
		kids = 15;
		gumballsPerKid = (gumballs / kids);

		System.out.print("True or false? ");
		System.out.println("Each kid gets 10 gumballs.");

		eachKidGetsTen = gumballsPerKid >= 10;

		System.out.println(eachKidGetsTen);
	}
}