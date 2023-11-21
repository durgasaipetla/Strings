package com.kodnest.stringsLevel1;

public class UpperLowerCounter {

int []count(String str1) {
	int  l=0;
	int  U=0;
	int arr[]=new int[2];
	arr[0]=0;
	arr[1]=0;
	for (int i = 0; i <str1.length(); i++) 
	{
	int c=(int)str1.charAt(i);
	if(c>=97&&c<=122) 
	{
      arr[0]++;
	}
	else if(c>=65&&c<=90) 
	{
      arr[1]++;
	}
	}
	
	return arr;
}
}
