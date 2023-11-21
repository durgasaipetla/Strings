package com.kodnest.stringslevel2;

public class Reverse {
public String stringReverse(String s1) {
	char arr1[]=s1.toCharArray();
	char arrrev[]=new char[arr1.length];
	for (int i = 0; i < arr1.length; i++) 
	{
		if(arr1[i]==' ') 
		{
      	arrrev[i]=arr1[i];
		}
		
	}
		int j=arrrev.length-1;
		for (int i=0; i <=arr1.length-1; i++) 
		{
			if(arr1[i]!=' ') 
			{
				if(arrrev[j]==' ') 
				{
					j--;
					
				}
				arrrev[j]=arr1[i];
				j--;
			}
		}
	s1=new String (arrrev);
	return s1;
}
}
