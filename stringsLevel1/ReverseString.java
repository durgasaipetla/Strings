package com.kodnest.stringsLevel1;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter string to reverse");
	String s1=scan.nextLine();
	System.out.println("String before reversing "+s1);
	char []arr1= s1.toCharArray();
	char arr2[]= new char[arr1.length];
	int j=arr2.length-1;
	for (int i = 0; i < arr1.length; i++) 
	{
		arr2[j]=arr1[i];
		j--;
	}
	s1=new String (arr2);
	System.out.println("String after reversing "+ s1);
	
}
}
