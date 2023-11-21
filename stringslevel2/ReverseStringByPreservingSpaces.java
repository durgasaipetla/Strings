package com.kodnest.stringslevel2;

import java.util.Scanner;

public class ReverseStringByPreservingSpaces {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter a string");
	String s1= scan.nextLine();
	Reverse reverse= new Reverse();
	String res=reverse.stringReverse(s1);
	System.out.println(res);
}
}
