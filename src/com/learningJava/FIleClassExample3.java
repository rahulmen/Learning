/*
 * 
 */

package com.learningJava;

import static java.lang.System.*;

public class FIleClassExample3 {

	static java.io.File f = new java.io.File("abc.txt");
	
 public static void main(String[] args){
	
	 
	 out.println(f.exists());
	 try{
	 f.createNewFile(); //Risky Code
	 
	 }catch(java.io.IOException e){
		 e.printStackTrace();
	 }catch(Exception e ){
		 System.out.println("File Not Present");
	 }
	 
	 out.println(f.exists());
	 
	 java.io.File f1 = new java.io.File("C:\\Users\\709003\\Desktop\\Study Material");
	 
	 String[] str = f1.list();
	 int count=0;
	 for(String str1:str){
		 
		 
		 java.io.File f2 = new java.io.File(f1,str1);
		 
		 if(f2.isDirectory()){
			 count ++;
			 System.out.println(str1);
			
 
		 }
		 
	 }

	 System.out.println(count);
 }
	
}
