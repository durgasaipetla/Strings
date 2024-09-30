package com.kodnest.Stringslevel4;

public class CountRepeatedCharacters {
	public static void main(String[] args) {
		String s1 = "RAMARAMASRI";
		String s2="";
		char strarr[] = s1.toCharArray();
		int count = 0;
		for (int i = 0; i <=s1.length()-1; i++) {
			if(!s2.contains(String.valueOf(s1.charAt(i)))) {
				s2=s2+s1.charAt(i);
			}
			}
		    System.out.println(s2);
	
		char strarr2[]=s2.toCharArray();
		for (int j = 0; j <strarr2.length; j++) {//RAMSI
		for (int k = 0; k <strarr.length; k++) {// RAMARAMASRI
			if(strarr2[j]==strarr[k]) {
				count++;
			}
			}
		System.out.println(strarr2[j]+"===>"+count);
		count=0;

			}
		}
	}
		