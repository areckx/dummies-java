import java.util.Arrays;
import java.util.Scanner; 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* areckx: !TODO! Read data from file
 * 
 * Right now I am working on a way to read the prices from a file. The ideal would be
 * to use an excel spreadsheet or an exported xml document most likely from a spreadsheet
 * so the fields could be worked with dynamically instead of expecting user input from the
 * console for each cost.
 * 
 * For now, I want the parser to:
 * 	
 * while (file != EOF) {
 * 	read(file) {
 * 		parse(first, second) // each line has format of `variableName	cost`
 * 		totalPrice += cost
 * 	}
 * }
 * 
 */

public class SnitSoft {
	private static Scanner cost;
	
	public static BufferedReader costTable;
	
	public static String currentParse = null;

	public static void scamPrice() {
		
		try {
			costTable = new BufferedReader(new FileReader("data/prices.table"));
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
			System.out.println("Error: File not found.");
		}
		
		try {
			
				String[] itemName = costTable.readLine().split("::"); 
				String[] itemCost = costTable.readLine().split("::");

				System.out.println(Arrays.asList(itemName)); 
				System.out.println(Arrays.asList(itemCost)); 

			while ( (currentParse = costTable.readLine()) != null ) {
				
				int i = 0;

				System.out.println(currentParse); 
					
				System.out.print("i = ");
				System.out.println(i); 
				
				System.out.print("itemName[");
				System.out.print(i);
				System.out.print("] = ");
				System.out.println(itemName[i]); 

				itemCost[i] = itemName[i];

				System.out.print("itemCost[");
				System.out.print(i);
				System.out.print("] = ");
				System.out.println(itemCost[i]); 
				
				System.out.println(Arrays.asList(itemName)); 
				System.out.println(Arrays.asList(itemCost)); 

				i++; 
			}
			
		} catch (IOException e) { 
			e.printStackTrace();
			System.out.println("Error: Unable to parse file.");
		} 

		/*
		cost = new Scanner(System.in); 
		
		System.out.print("What's the price of the super amazing CD-ROM? ");
		double cdPrice = cost.nextDouble();

		System.out.print("What's the shipping and handling? ");
		double shippingAndHandling = cost.nextDouble();
		
		System.out.print("We will bill $");
		System.out.print(cdPrice + shippingAndHandling);
		System.out.println(" to your credit card."); 
		*/
	} 
}

/* areckx: Types
 * 
 * Reading chapter six, I am having a sort of revelation about how to look at the 
 * data that exists within a machine.
 * 
 * Burd uses the binary value of 01001010 (74 in decimal) to illustrate his point. To quote
 * the sentence that helped this click for me, he said "So what do the letters g-i-f-t really 
 * mean? Well, they don't mean anything until you decide on a way to interpret them."
 * 
 * so the declaration `double amount;` tells the compiler or interpreter that amount is
 * to be seen as a double type. This is all stuff I had already learned about, but I am 
 * starting to see it in a different way. 
 * 
 * Hopefully it is a clearer way of seeing it.
 */