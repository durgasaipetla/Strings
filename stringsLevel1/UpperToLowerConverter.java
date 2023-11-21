package com.kodnest.stringsLevel1;

import java.util.Scanner;

public class UpperToLowerConverter {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the string in UpperCase ");
	String s1= scan.nextLine();
	System.out.println("==> After convert to LowerCase : "+s1.toLowerCase());
}
}
