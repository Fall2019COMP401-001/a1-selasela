package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemAmt = scan.nextInt();
		
		String[] storeItems = new String[itemAmt];
		// make array for items
		
		for (int i=0; i<itemAmt; i++) {
			storeItems[i] = scan.next();
			@SuppressWarnings("unused")
			double blah = scan.nextDouble();
		}
		// looping through the list to fill in above array
		

		int custNum = scan.nextInt();
		// number of customers
		
		int[] cust = new int[itemAmt];
		// array of how many customers bought a certain item
		
		int[] total = new int[itemAmt];
		// array to track how many of each item was bought
		
		for (int i=0; i<custNum; i++) {
			
			@SuppressWarnings("unused")
			String first = scan.next();
			@SuppressWarnings("unused")
			String last = scan.next();
//			// scanning for first and last name
//			
			// cust[i] = first + " " + last;
			// putting customer name into cust array

			int itemTot = scan.nextInt();
			// number of items per person
			
			for (int j=0; j<itemTot; j++) {
				int quant = scan.nextInt();
				String item = scan.next();
				// identifying number of the item and name of the item
				
				//double spent = 0;
				
				for (int x=0; x<itemAmt; x++) {
					if (item.compareTo(storeItems[x]) == 0) {
						total[x]+=quant;
						// adds count on item
						cust[x]+=1;
					}
				}
			
			}
		}
		
		
		
		for (int i=0; i<storeItems.length; i++) {
			if(total[i]==0) {
				System.out.println("No customers bought " + storeItems[i]);
			} else {
				System.out.println(cust[i] + " customers bought " + total[i] + " " + storeItems[i]);
			}
		}
		// for loop
		// if else statement (in loop) to see what items were/were not bought
		// print certain things in if/else blocks
		
	
		
		scan.close();
	}
}
