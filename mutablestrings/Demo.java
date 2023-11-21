package com.kodnest.mutablestrings;

public class Demo {
public static void main(String[] args) {
	StringBuffer str= new StringBuffer("Rama");
	System.out.println(str);
	str.append("Sita");
	System.out.println(str);
	StringBuilder strb= new StringBuilder("Ravana");
	System.out.println(strb);
	strb.append("asura");
	System.out.println(strb);
}
}
