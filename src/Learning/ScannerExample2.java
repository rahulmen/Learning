package Learning;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		
		int uid;
    	String uname;
		String username;
		String password;
		String mnumber;
		double rating;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the User Details  :");
		System.out.println("Enter the id :");
		uid = s.nextInt();
		System.out.println("Enter the name :");
		uname = s.next();
		System.out.println("Enter the username :");
		username = s.next();
		System.out.println("Enter the password :");
		password = s.next();
		System.out.println("Enter the mobilenumber :");
		mnumber = s.next();
		System.out.println("Enter the rating :");
		rating = s.nextDouble();
		
		System.out.println("User details are :");
		System.out.println("Id : "+ uid);
		System.out.println("Name : "+ uname);
		System.out.println("Username: "+ username);
		System.out.println("Mobile Number : "+ mnumber);
		System.out.println("Rating : "+ rating);
		
	}

}
