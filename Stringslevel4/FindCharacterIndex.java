package com.kodnest.Stringslevel4;

import java.util.Scanner;

public class FindCharacterIndex {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a string..");
	String str= sc.nextLine();
	System.out.println("Enter a character to search the index");
	char ch= sc.next().charAt(0);
	for(int i=str.length()-1;i>=0;i--) {
		if(ch==str.charAt(i)) {
			System.out.println("The index of character is: "+i);
			return;
		}
	}
		System.out.println("Plz Enter the character present in the string....");
}
}
