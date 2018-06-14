
public class SnitSoft {

	public static void scamPrice() {
		
		double amount;
		
		amount = 5.95;
		amount += 25.00;
		
		System.out.print("We will bill $");
		System.out.print(amount);
		System.out.println(" to your credit card."); 
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
