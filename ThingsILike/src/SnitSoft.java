import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	
	/*
	public static void scamPrice() {
		
		cost = new Scanner(System.in); 
		
		System.out.print("What's the price of the super amazing CD-ROM? ");
		double cdPrice = cost.nextDouble();

		System.out.print("What's the shipping and handling? ");
		double shippingAndHandling = cost.nextDouble();
		
		System.out.print("We will bill $");
		System.out.print(cdPrice + shippingAndHandling);
		System.out.println(" to your credit card."); 

	} 
	*/ 
	
	public static String[] scamPriceTable(String filename) throws IOException {
		FileReader fileReader = new FileReader(filename); 
		BufferedReader bufferedReader = new BufferedReader(fileReader); 
		List<String> table = new ArrayList<String>();
		String line = null;
		
		while ( (line = bufferedReader.readLine() ) != null ) {
			table.add(line); 
		} 

		bufferedReader.close();
		return table.toArray(new String[table.size()]);
	} 
	
	
	public static void scamPricePrint(String[] table) throws IOException {
		
		System.out.println(Arrays.toString(table)); 

		String[] totalName = table;
		String[] totalPrice = table;

		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]); 

			String grep = table[i];
			
			String[] nameAndPrice = grep.split("::");
			
			System.out.println(Arrays.toString(nameAndPrice)); 
			
			totalName[i] = nameAndPrice[0];
			totalPrice[i] = nameAndPrice[1]; 
			
			System.out.println(Arrays.toString(nameAndPrice)); 
			System.out.println(Arrays.toString(totalName));
			System.out.println(Arrays.toString(totalPrice));
			
		}
	}
	
	/* areckx: !FIXME!
	 * Need to parse the values from each array entry with String.split("::")
	 */
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