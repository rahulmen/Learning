package com.learningJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriterReaderExample1{
	
	public static void main(String[] args) throws IOException{
	
	File f = new File("abc.txt");
	
	FileWriter fw = new FileWriter(f,true);
	FileReader fr = new FileReader(f);
	
/*	int ch = fr.read();
	
	
	while(ch!=-1){
		
		System.out.print((char)ch);
		ch = fr.read();
	}*/
	
	BufferedWriter bw = new BufferedWriter(fw);
	
	bw.write("efefefefefe");
	bw.newLine();
	bw.flush();
	bw.close();
	
	
	
	BufferedReader br = new BufferedReader(fr);
	
	String str = br.readLine();
	
	while(str!=null){
		System.out.println(str);
		str = br.readLine();
	}
	
	br.close();
	
	

	
	
	
	
	}
	
	

}
