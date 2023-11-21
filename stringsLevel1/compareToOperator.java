package com.kodnest.stringsLevel1;

import java.util.Scanner;

public class compareToOperator {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter two string to compare which one is greater");
	String s1=sc.next();
	String s2=sc.next();
	if(s1.compareTo(s2)>0) 
	{
		System.out.println(s1+" is greater than "+s2);
	}
	else if(s1.compareTo(s2)<0) 
	{
		System.out.println(s2+" is greater than "+s1);
	}
	else 
	{
		System.out.println("Strings are equal");
	}
}
}
