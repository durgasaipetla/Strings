package com.kodnest.Stringslevel4;

import java.util.Scanner;

public class AnagramApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two strings to check it is anagrams or not");
	String s1= sc.nextLine();
	String s2= sc.next();
	Anagram anagram= new Anagram();
    boolean res=anagram.CheckingAnagram(s1,s2);
	if(res==true) {
		System.out.println("The entered strings are anagrams");
	}
	else {
		System.out.println("The entered strings are not anagrams");
	}
}
}
