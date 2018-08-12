package com.stackroute.pe4;

public class Transpose {
   
	  public String transpose(String s) {
		  String[] str=s.split(" ");
		  String rev="";
		  for(int i=0;i<str.length;i++)
		  {
			  	String s1=str[i];
			  	String revWord="";
			  	for(int j=s1.length()-1;j>=0;j--) {
			  		revWord=revWord+s1.charAt(j);
			  	}
			  	rev=rev+revWord+" ";
		  }
		  return rev.trim();
	  }
	  
}
