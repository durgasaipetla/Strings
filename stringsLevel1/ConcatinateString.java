package com.kodnest.stringsLevel1;

import java.util.Scanner;

public class ConcatinateString {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the strings of same name");
	String s1= scan.next();
	String s2= scan.next();
	Concate return1=new Concate();
	
	System.out.println("The Concatinataed String is "+return1.returning(s1, s2));
}
}
