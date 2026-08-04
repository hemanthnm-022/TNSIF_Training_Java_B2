package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name :");
		   char ch= scan.next().charAt(4);
		   System.out.println("Fourth character is :" +ch);
		   

	}

}
