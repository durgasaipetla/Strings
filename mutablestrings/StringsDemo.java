package com.kodnest.mutablestrings;

import java.util.Scanner;

public class StringsDemo {
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	char[] arr1=new char[5];
	System.out.println("enter the 5 String array elements");
	for(int i=0;i<=arr1.length-1;i++) 
	{
		arr1[i]=sc.next().charAt(0);
	}
	System.out.println("printing the array elements");
	for (char c : arr1) 
	{
		System.out.print(c+ " ");	
	}
	System.out.println();
	char[]arr2= new char[5];
	for(int i=0;i<=arr1.length-1;i++) 
	{
	     arr2[i]=arr1[i];
	}
	System.out.println("Printing the elements in normal order");

	for (char x : arr1)
	{
		System.out.print(x+" ");	
	}
	System.out.println();
	char[]arr3= new char[arr2.length];
	int j=0;
	for(int i=arr2.length-1;i>=0;i--) 
	{
	     arr3[j]=arr2[i];
	     j++;
	}
	System.out.println("Printing the elements in reverse order");
	for (char c : arr3) 
	{
		System.out.print(c+ " ");
		
	}
}
}
