package com.kodnest.Stringslevel4;

import java.util.Scanner;

public class SumOfDigitsAndConcatenate {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a string");
	String s= sc.nextLine();
	System.out.println("The string is");
	s=s.toUpperCase();
	StringBuffer sb= new StringBuffer();
	for (int i =0; i <s.length(); i++) {
		if((s.charAt(i) >=(char)65&&s.charAt(i)<=(char)90)&& (s.charAt(i)>=32 || s.charAt(i)<=42)) {
			sb.append(s.charAt(i));
		}
		else {
		continue;	
		}
		}
	int sum=0;
	for (int i =0; i <s.length(); i++) {
		if((s.charAt(i)>=(int)48 && s.charAt(i)<=(int)57)) {
			sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		else {
		continue;	
		}
		}
	     sb.append(sum);
	     String s3= new String(sb);
	     System.out.println(s3);
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	for(char ch='a';ch<='z';ch++) {
//		if(s.charAt(0)==ch)
//		{
//			System.out.println(sb.append(s.charAt(ch)));
//		}
//	}
//	String s2= new String (sb);
//	System.out.println(s2);


