package com.kodnest.stringsLevel1;

public class PalindromeString {
  boolean isPalindrome(String s1) { 
	char []arr1= s1.toCharArray();
	char arr2[]= new char[arr1.length];
	int j=arr2.length-1;
	for (int i = 0; i < arr1.length; i++) 
	{
		arr2[j]=arr1[i];
		j--;
	}
	 String s2=new String (arr2);
	if(s2.equals(s1)) 
	{
     return true;	}
	else 
	{
	return false;
		}
}
}
