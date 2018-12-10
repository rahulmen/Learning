package Learning;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Credit Card details");
		System.out.println("Enter the expiry month :");
		int month = s.nextInt();
		System.out.println("Enter the card holder name :");		
		String name = s.next();
		System.out.println("Enter the credit balance :");
		double climit = s.nextDouble();
		
		
		System.out.println("Credit Card Details");
		System.out.println("Expiry Month : "+ month);
		System.out.println("Name : "+ name);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Credit Balance : " + df.format(climit));
		
		s.close();

	}

}
