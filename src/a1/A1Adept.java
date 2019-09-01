package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemAmt = scan.nextInt();
		
		String[] storeItems = new String[itemAmt];
		double[] storePrices = new double[itemAmt];
		// make array for items and their prices
		
		for (int i=0; i<itemAmt; i++) {
			storeItems[i] = scan.next();
			storePrices[i] = scan.nextDouble();
		}
		// looping through the list to fill in above arrays
		
		
		
		int custNum = scan.nextInt();
		// number of customers
		
		String[] cust = new String[custNum];
		// array of customers to loop through later when calling functions
		
		double[] total = new double[custNum];
		// array of money a person spent to parallel the cust array
		
		for (int i=0; i<custNum; i++) {
			
			String first = scan.next();
			String last = scan.next();
			// scanning for first and last name
			
			cust[i] = first + " " + last;
			// putting customer name into cust array

			int itemTot = scan.nextInt();
			// number of items per person
			
			for (int j=0; j<itemTot; j++) {
				int quant = scan.nextInt();
				String item = scan.next();
				// identifying number of the item and name of the item
				
				double spent = 0;
				
				for (int x=0; x<itemAmt; x++) {
					if (item.compareTo(storeItems[x]) == 0) {
						spent = storePrices[x]*quant;
						// calculates corresponding item
						total[i] += spent;
						// storing price in total array
						// put total array filler here?
					}
				}
			
			}
		}
		
		double b = biggest(total, cust);
		double s = smallest(total, cust);
		double a = avg(total);
//		String ba = Double.toString(b);
//		String sa = Double.toString(s);
//		String aa = Double.toString(a);
//		System.out.println(ba);
//		System.out.println(sa);
//		System.out.println(aa);
		String ba = String.format("%.2f", b);
		String sa = String.format("%.2f", s);
		String aa = String.format("%.2f", a);
//		// call helper functions for biggest, smallest, and avg
//		// use cust and total arrays as arguments
		
		System.out.println("Biggest: " + cust[idBig(total, cust)] + " (" + ba + ")");
		System.out.println("Smallest: " + cust[idSmall(total, cust)] + " (" + sa + ")");
		System.out.println("Average: " + aa);
		// print output
		// how do i get name in the print?
		// how does trac leave/translate outside the helper function??
		
		
		scan.close();
		// close scan
	}
		
		
	static double biggest(double[] money, String[] people) {
		double ans = money[0];
		for (int i=0; i<money.length; i++) {
			if (money[i]>ans) {
				ans = money[i];
			}
		}
		return ans;
	}
	
	static int idBig (double[] money, String[] people) {
		double ans = money[0];
		int trac = 0;
		for (int i=0; i<money.length; i++) {
			if (money[i]>ans) {
				trac = i;
			}
		}
		return trac;
	}
	
	static double smallest(double[] money, String[] people) {
		double ans = money[0];
		for (int i=0; i<money.length; i++) {
			if (money[i]<ans) {
				ans = money[i];
			}
		}
		return ans;
	}
	
	static int idSmall (double[] money, String[] people) {
		double ans = money[0];
		int trac = 0;
		for (int i=0; i<money.length; i++) {
			if (money[i]<ans) {
				trac = i;
			}
		}
		return trac;
	}
		
	static double avg(double[] money) {
		double ans = 0;
		for (int i=0; i<money.length; i++) {
			ans += money[i];
		}
		ans /= money.length;
		return ans;
	}

	
}

