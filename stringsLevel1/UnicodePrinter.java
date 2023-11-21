package com.kodnest.stringsLevel1;

import java.util.Scanner;

public class UnicodePrinter {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the string");
	String s1= scan.next();
	char arr[]=s1.toCharArray();
	int arr2[]= new int[arr.length];
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr2[i]=(int)arr[i];
	}
	for (int i = 0; i < arr2.length; i++) {
		System.out.println("The unicode value of "+arr[i]+" is "+arr2[i]);
		
	}
}
}
