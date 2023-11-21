package com.kodnest.stringsLevel1;

import java.util.Scanner;

public class LengthChecker {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any two strings ");
	String s1= scan.nextLine();
	String s2= scan.nextLine();
    if(s1.length()==s2.length()) 
    {
    System.out.println("Both strings are same length");	
    }
    else 
    {
    	System.out.println("Both strings are different length");
    }
}
}
