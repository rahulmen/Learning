package Learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class BufferReaderEXample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.00");

		/*System.out.println("Enter the agent details");
		System.out.println("Enter the agent name :");
		String name = br.readLine();
		System.out.println("Enter the identification number :");
		String inum = br.readLine();
		System.out.println("Enter the accountNumber :");
		String anum = br.readLine();*/
		System.out.println("Enter the creditLimit :");
		double climit = br.read();
		
		System.out.println(df.format(climit));
		
		/*climit = df.format(climit);
		System.out.println("Agent details are");
		System.out.println("Name : "+ name);
		System.out.println("Identification Number : "+ inum);
		System.out.println("Account Number : "+ anum);
		System.out.println("Credit Limit : "+ climit );*/

	}

}
