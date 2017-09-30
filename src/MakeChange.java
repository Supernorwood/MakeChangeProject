import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price;
		int cashTendered;
		int difference = 0;
		int change;
		double changeDisplay;

		// The user is prompted asking for the price of the item.
		System.out.print("What is the price of the item? \t  ");
		price = (int) Math.round(sc.nextDouble() * 100);

		// The user is then prompted asking how much money was
		// tendered by the customer.
		System.out.print("Insert cash tendered: \t  ");
		// cashTendered = sc.nextInt();
		cashTendered = (int) Math.round(sc.nextDouble() * 100);

		// Display an appropriate message if the customer provided
		// too little money or the exact amount.

		// System.out.println("Please provide enough to cover " + "your $" + difference
		// + " difference");
		// }

		if (cashTendered > price) {
			change = cashTendered - price;
			changeDisplay = (double) change;
			System.out.println("Here comes your change of $" + changeDisplay / 100 + " as follows");
			// System.out.println("The change is: " + ((cashTendered - price)/100.00));
			// System.out.println("The customer should be given the change as follows:");

			// change = (int)(Math.ceil(change*100));
			// int dollars = change/100;
			// change=change%100;
			// System.out.println("Dollars: " + dollars);

			int twenties = change / 2000;
			if (twenties > 0) {
				change = change % 2000;
				System.out.println(twenties + " $20 bill(s)");
			}

			int tens = change / 1000;
			if (tens > 0) {
				change = change % 1000;
				System.out.println(tens + " $10 bill(s)");
			}
			int fives = change / 500;
			if (fives > 0) {
				change = change % 500;
				System.out.println(fives + " $5 bill(s)");
			}
			int ones = change / 100;
			if (ones > 0) {
				change = change % 100;
				System.out.println(ones + " $1 bill(s)");
			}
			int quarters = change / 25;
			if (quarters > 0) {
				change = change % 25;
				System.out.println(quarters + " quarter(s)");
			}
			int dimes = change / 10;
			if (dimes > 0) {
				change = change % 10;
				System.out.println(dimes + " dime(s)");
			}
			int nickels = change / 5;
			if (nickels > 0) {
				change = change % 10;
				System.out.println(nickels + " nickel(s)");
			}
			int pennies = change / 1;
			if (pennies > 0) {
				change = change % 10;
				System.out.println(pennies + " penny(s)");
			}

		} else if ((cashTendered < price)) {
			difference = ((price - cashTendered));
			System.out.println("You provided too litte, please make up the difference of " + difference);
		} else {
			System.out.println("No change is neccesary");

		}

	}
}

// If the amount tendered is more than the cost of the item,
// display the number of bills and coins that should be given
// to the customer.

// int changeDue = 0;
//
// int change = (int)(Math.ceil(changeDue*100));
// int dollars = Math.round((int)change/100);
// change=change%100;
// int quarters = Math.round((int)change/25);
// change=change%25;
// int dimes = Math.round((int)change/10);
// change=change%10;
// int nickels = Math.round((int)change/5);
// change=change%5;
// int pennies = Math.round((int)change/1);
//
// System.out.println("Dollars: " + dollars);
// System.out.println("Quarters: " + quarters);
// System.out.println("Dimes: " + dimes);
// System.out.println("Nickels: " + nickels);
// System.out.println("Pennies: " + pennies);