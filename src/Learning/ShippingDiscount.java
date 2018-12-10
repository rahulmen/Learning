package Learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ShippingDiscount {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the weight");
		int weight = s.nextInt();
		System.out.println("Enter the distance");
		int distance = s.nextInt();
		
		
		if (weight < 100 || distance < 500)
		{
			System.out.println("Datex shipping offers discount");
		}
		else
		{
			System.out.println("Datex shipping offers no discount");
		}
	}

}
