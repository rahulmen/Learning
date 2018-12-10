/*
 * 
 */

package com.learningJava;

import java.io.File;
import java.io.IOException;

public class FIleClassExample2 {

	
	public static void main(String[] args) throws IOException{

		int count=0;
		File f = new File("C:\\Users\\703426\\workspace\\trainingTestNG");
		String[] str = f.list();

for(String s1:str){
	
	File f1 = new File(f,s1);
	if(f1.isDirectory()){
		count++;
		System.out.println(s1);
	}
	
}
System.out.println(count);

	}
}
