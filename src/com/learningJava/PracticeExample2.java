/*
 * Program to find duplicate records and print create file with only unique ones
 */

package com.learningJava;

import java.io.IOException;
import java.io.*;

public class PracticeExample2 {

	public static void main(String[] args) throws IOException{

		PrintWriter pw = new PrintWriter("C:\\Users\\709003\\Desktop\\File5.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\709003\\Desktop\\File 4.txt"));
		
		String line = br.readLine();
		
		
		while(line!=null){
		
			boolean b = false;
			
			BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\709003\\Desktop\\File5.txt"));
			
			String line1 = br1.readLine();
			
			while(line1!=null ){
			
			if(line.equals(line1)){
				b=true;
				break;				
			}
			
			line1 = br1.readLine();
			
			}
			
			
			if(b==false){
			pw.println(line);
			pw.flush();
			}
			line = br.readLine();
			
		}
		
		
	}

}
