package Learning;

import java.util.Scanner;

public class ShipmentCompaniesGrading {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the total number of countries :");
		int countries = s.nextInt();
		System.out.println("Enter the total number of shipment per month :");
		int shipments = s.nextInt();
		
		if (countries>150 && shipments>1500)
		{
			System.out.println("The company grade is : A");
		}
		else if (countries>125 && shipments>1200)
		{
			System.out.println("The company grade is : B");
		}
		else if (countries>100 && shipments>1000)
		{
			System.out.println("The company grade is : C");
		}
		else if (countries>75 && shipments>700)
		{
			System.out.println("The company grade is : D");
		}
		else if ((countries<=75 && countries>=0) && (shipments<=700 && shipments>=0))
		{
			System.out.println("The company grade is : E");
		}
		else if (countries<0 || shipments<0)
		{
			System.out.println("Invalid Input");
		}
	}

}
