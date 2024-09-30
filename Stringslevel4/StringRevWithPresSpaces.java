package com.kodnest.Stringslevel4;
import java.util.Scanner;
public class StringRevWithPresSpaces {
	public static void main(String[] args) {
		System.out.println("Enter a string to reverse the string the string with preserved spaces");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char arr[]= input.toCharArray();
		char arr2[]= new char[arr.length];
		for(int i =0; i<=arr.length-1;i++) {
			if(arr[i]==' ') {
				arr2[i]=arr[i];
			}
		}
		int j = arr2.length-1;
		for(int i =0; i<=arr.length-1;i++) {
			if(arr[i]!=' '){
				if(arr2[j]==' ') {
				j--;
			}		
			
			arr2[j]=arr[i];
			j--;
		}
	
		}
		String s=new String(arr2);
		System.out.println("The reversed string after preserving spaces is: "+s );
		
		
	}

}
