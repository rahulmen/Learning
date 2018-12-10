/*
 * Lambda Expression is anonomous FUntion which dont have any name,return type and and modifier
 * We can use Lamdba Expression only where we have concept of FuntionalIntrface
 * FuntionalInterface is interface that have only 1 abstract method.
 * 
 */


package com.learningJava;

public class LambdaClass {
	
	public static void main(String[] args){
		
		//Lambda Expression
		interf i = ()->{System.out.println("Hello");};
		i.m1();
		interf2 i2 = (int a,int b) -> {System.out.println("Sum of a and b is:"+(a+b));};
		i2.m1(20, 30);
		interf3 i3 = (a)->{return a*a;};
		System.out.println(i3.m1(30));
		
	}

}
