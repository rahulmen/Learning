package JavaProblems;

import java.util.Scanner;

public class Paramid {
	public static void main(String[] args)
	{


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value :" );
		int input = Integer.parseInt(scan.nextLine());
		scan.close();

		int space = input-1;
		int space2=0;
		int length = input;

		for(int len=0;len<input;len++){
			for(int s=0;s<space;s++){
				System.out.print(" ");
			}
			
			
			
			for(int len2=input;len2>space;len2--){
				System.out.print("* ");
			}

			space =space -1;
			System.out.println();
		}
		
		

	}
}

/*
O/p:-

 *
 * *
 * * *
 * * * *
 * * *
 * *
 *

 */