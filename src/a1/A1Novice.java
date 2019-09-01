package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		int custNum = scan.nextInt();
				
		for (int i=0; i<custNum; i++) {
			double total = 0;
			
			String firstIn = scan.next().charAt(0) + ". ";
			String last = scan.next();
			
			int numOfItems = scan.nextInt();
			for (int j=0; j<numOfItems; j++) {
				int quantity = scan.nextInt();
				@SuppressWarnings("unused")
				String item = scan.next();
				double howMuch = scan.nextDouble();
				double sale = quantity*howMuch;
				total += sale;
			}
			String listing = firstIn + last + ": " + total;
			
			System.out.println(listing);
		}
			
		
		
		scan.close();
		// close scanner
	}
}
