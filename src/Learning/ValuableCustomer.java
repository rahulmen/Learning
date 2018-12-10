package Learning;

import java.util.Scanner;

public class ValuableCustomer {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of shipments per month :");
		int num = s.nextInt();
		
		if (num > 20)
		{
			System.out.println("Valuable customer");
		}
		else if (num <= 20 && num >0 )
		{
			System.out.println("Not a valuable customer");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
