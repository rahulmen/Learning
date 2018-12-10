package Learning;

import java.util.Scanner;

public class ArraySystem {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();;
		int b[] = new int[a];
		
		for (int i = 0; i < a; i++)
		{
			b[i] = s.nextInt();

		}
		
		
	}

}
