package com.kodnest.Stringslevel4;

import java.util.Scanner;

public class Pangram {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a sentence to check whether it is pangram or not ");
	String s= sc.nextLine();//The quick brown fox jumps over the lazy dog
	s.toLowerCase();
	for(char i='a'|'A';i<='z';i++) {
		if(!s.contains(String.valueOf((i)))) {
			System.out.println("The string is not a pangram");
			return;
		}
		else {
			continue;
		}
	}
	System.out.println("The entered string is pangram");
	
}
}
