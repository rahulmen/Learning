package Learning;

import java.util.Scanner;

public class LuckyCustomerPhilips {
	
	public static void main(String[] args) {
		int remainder;
		int remaindernew;
		int sum = 0;
		Scanner s = new Scanner(System.in);
		int cid = s.nextInt();
		
		if (cid <= 0)
		{
			System.out.println("Invalid Input");
		}
		
		while (cid > 0)
		{
			remainder = cid % 10;
			sum = sum + remainder;
			cid = cid/10;	
		}
		
		while (sum > 0)
		{
			remaindernew = sum % 10;
			if (remaindernew==8 || remaindernew == 5)
			{
				System.out.println("Lucky Customer");
				break;
			}
			else
			{
				System.out.println("Unlucky Customer");
				break;
			}
		}
		

		

	}

}
