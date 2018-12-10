/*
 * Program to check number present in file 2 and file 1 and create file 3 excluding number present in file 2
 */

package com.learningJava;

import java.io.IOException;
import java.io.*;

public class PracticeExample1 {

	public static void main(String[] args) throws IOException{

		PrintWriter pw = new PrintWriter("C:\\Users\\709003\\Desktop\\File3.txt");

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\709003\\Desktop\\File1.txt"));

		String line = br.readLine();

		while(line!=null){

			boolean b = false;

			@SuppressWarnings("resource")
			BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\709003\\Desktop\\File2.txt"));

			String line2 = br2.readLine();

			while(line2!=null){

				if(line.equals(line2)){

					b = true;
					break;
				}

				line2 = br2.readLine();
			}

			if(b==false){
				pw.println(line);
			}
			line = br.readLine();

		}

		br.close();
		pw.flush();
		pw.close();


	}

}
