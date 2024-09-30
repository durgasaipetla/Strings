package com.kodnest.Stringslevel4;

import java.util.Scanner;

public class SubstringFrequency {
public static void main(String[] args) {
	System.out.println("Enter a string ");
	Scanner sc= new Scanner(System.in);
	String str1= sc.next();
	System.out.println("Enter a word to check frequency");
	String s2= sc.next();
//	int index = str1.indexOf(s2);
//	int frequency = 1;
//	while (index != -1) {
//	  frequency++;
//	  index = str1.indexOf(s2, index + 1);
//	}
//	System.out.println(frequency); // 2
	String[] strings = str1.split(s2);
	int frequency = strings.length;
	System.out.println(frequency);
}
}