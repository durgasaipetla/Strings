package com.kodnest.Stringslevel4;
import java.util.Arrays; 
public class Anagram {
public boolean CheckingAnagram(String s1,String s2) {
	s1.toLowerCase();
	s2.toLowerCase();
	char arr1[]=s1.toCharArray();
	char arr2[]=s2.toCharArray();
	Arrays.sort(arr1); 
	Arrays.sort(arr2); 
	for(int i=0;i<arr1.length;i++) {
	if(arr1[i]!=arr2[i]) {
		return false;
	}
	else {
		continue;
	}
	}
	return true;

}
}
