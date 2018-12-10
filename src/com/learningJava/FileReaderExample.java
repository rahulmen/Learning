package com.learningJava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	
	public static void main(String[] args) throws IOException{
		
		
		File f = new File("xyz.txt");
		
		//FileWriter f1 = new FileWriter(f);
		//f1.write("yujhbvvvvvvvvvvwdwkdbwkdnbwkdwkdwkdbwkbdwkdbw\nduywbdwjbdwd\ndwujbvdjwdbvwjd\nddwdwdwd");
	
		//f1.flush();
		//f1.close();
		
		FileReader f2 = new FileReader(f);
		
		char[] ch = new char[(int)f.length()];
		
		f2.read(ch);
		
		for(char ch1:ch){
			System.out.print(ch1);
		}
		 
		
		FileReader f21 = new FileReader(f);
		int i = f21.read();
		while(i!=-1){
			
			System.out.print((char)i);
			i=f21.read();
			
		}
		
		f2.close();
		f21.close();
		
	}

}
