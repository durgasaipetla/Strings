package com.kodnest.Stringslevel4;

import java.util.Scanner;

public class SmallestWordInString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a sentence to find the smallest word");
	String s =sc.nextLine();
	String strarr[]=s.split(" ");
	String min=strarr[0];
	for(int i=0;i<strarr.length;i++) {
		if(strarr[i].length()< min.length()) {
		min=strarr[i];
		}
		else {
			continue;
		}
	}
	System.out.println("The smallest word in a string is: "+min);
}
}
