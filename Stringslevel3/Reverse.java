package com.kodnest.Stringslevel3;

public class Reverse {
	public String reverseStringWord(String s1) {
	 String words[]=s1.split(" ");
	 String revword= null;
	 String revString="";
	    for (int i = 0; i <=words.length-1; i++) 
	    {
	     String word =words[i];
		 char arrword[]=word.toCharArray();
		 char revwordarr[]=new char[arrword.length];
		 
	    int j=revwordarr.length-1;
	    for(int k=0;k<=arrword.length-1;k++) 
	    {
	    revwordarr[j]=arrword[k];
	    	j--;
	    }
	 revword = new String(revwordarr);
     revString=revString+revword+" ";	    
     }
	    return  revString;
	}   
}
