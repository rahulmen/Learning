/*
 * FileWriter is used to write Data into the file and if file is not present it will create the
 * File and write Data into it.
 * 
 * Have 4 Constructor
 * ==============================
 * FileWriter file = new FileWriter(String filename);
 * FileWriter file = new FileWriter(File f);
 * FileWriter file = new FileWriter(String filename,boolean append);
 * FileWriter file = new FileWriter(String filename,boolean append);
 * 
 * Basically have 5 methods
 * =========================================
 * write(int ch)
 * write(char[] ch)
 * write(String str)
 * flush()
 * close()
 */


package com.learningJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) throws IOException{
		
		File f = new File("abc.txt");
		FileWriter file = new FileWriter(f,true);
		
		file.write('A');
		char[] ch = {'a','d','f','g','h','h'};
		file.write(ch);
		file.write('\n');
		file.flush();
		file.close();
	
		
	}

}
