/*
 * File Class in Java is written on concept of Unix. Hence in Unix both File and Directory is 
 * considered as File.
 */


package com.learningJava;

import java.io.File;
import java.io.IOException;

public class FIleClassExample {
	
	
	public static void main(String[] args) throws IOException{
	File f = new File("abc.txt"); 
	/*
	 This line has just created a Java File Object and no
	 Physical Object has been created same goes for next line 
	 where Java Directory Object is created
	*/									
	File f1 = new File("Test");
	File f2 = new File(f1,"xyz.tct");

	}
}
