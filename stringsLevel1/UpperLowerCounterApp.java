package com.kodnest.stringsLevel1;

import java.util.Scanner;

public class UpperLowerCounterApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the string to check the numbers of lower & upper case letters");
	String s1= scan.nextLine();
	UpperLowerCounter upc =new UpperLowerCounter();
	int[]res=upc.count(s1);
	System.out.println("The no of lower case letters are "+ res[0]);
	System.out.println("The no of Upper case letters are "+ res[1]);

}
}
