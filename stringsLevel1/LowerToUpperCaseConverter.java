package com.kodnest.stringsLevel1;

import java.util.Scanner;

public class LowerToUpperCaseConverter {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the string in lowerCase");
	String s1= scan.nextLine();
	System.out.println(s1.toUpperCase());
}
}
