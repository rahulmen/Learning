package com.learningJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergingFile {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		
		
		
		PrintWriter pw = new PrintWriter("‪File123.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		String line = br.readLine();
		
		while(line!=null){
			
			pw.println(line);
			line = br.readLine();
			
		}
				
 br = new BufferedReader(new FileReader("xyz.txt"));
		
		line = br.readLine();
				
		
		while(line!=null){
			
			pw.println(line);
			line = br.readLine();
			
		}
		br.close();
		pw.flush();
		pw.close();
	}

}
