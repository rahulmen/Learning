/*
 * Merging Two file line by line
 */

package com.learningJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergingFile2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		
		
		
		PrintWriter pw = new PrintWriter("‪File1234.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("xyz.txt"));
		
		
		String line = br.readLine();
		String line2 = br1.readLine();
		
		while(line!=null || line2!=null){
			
			if(line!=null){
			pw.println(line);
			line = br.readLine();
			}
			if(line2!=null){
			pw.println(line2);
			line2 = br1.readLine();
			}
		}
		br1.close();	
		br.close();
		pw.flush();
		pw.close();
	}

}
