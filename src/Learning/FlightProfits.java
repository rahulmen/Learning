package Learning;

import java.util.Scanner;

public class FlightProfits {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number of months :");
		int months = s.nextInt();
		if (months<=0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int profit;
		int total = 0;
		System.out.println("Enter the profit of each month in shipment");
		for (int i = 0; i < months ; i++)
		{
			profit  = s.nextInt();
			total = total + profit ;
		}
			System.out.println("Total profit : " + total);
		
	}

}
