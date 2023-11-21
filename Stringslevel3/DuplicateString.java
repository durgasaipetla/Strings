package com.kodnest.Stringslevel3;

import java.util.Scanner;

public class DuplicateString {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a string");
String s1=scan.nextLine();
String s2="";
for (int i = 0; i <=s1.length()-1; i++) {
	if(!s2.contains(String.valueOf(s1.charAt(i)))){
		s2=s2+s1.charAt(i);
	}
}
System.out.println("The Duplicate Sting is: "+s2);
}
}
