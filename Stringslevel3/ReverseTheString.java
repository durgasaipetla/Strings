package com.kodnest.Stringslevel3;

import java.util.Scanner;

public class ReverseTheString{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string");
	String s1= scan.nextLine();
	System.out.println("Original string word is "+s1);
   Reverse reverse= new Reverse();
   String res=reverse.reverseStringWord(s1);
   System.out.println("Reversed string word is "+res);
}
}
