package com.kodnest.stringsLevel1;

import java.util.Scanner;

public class PalindromeStringApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter string to check whether the string is palindrome or not");
	String s1=scan.nextLine();
	PalindromeString ps =new PalindromeString();
	boolean res=ps.isPalindrome(s1);
	if(res==true) 
	{
		System.out.println("Entered string " +s1+ " is palindrome string ");
	}
	else 
	{
		System.out.println("Entered string " +s1 +" is not palindrome string ");
	}
}
}
