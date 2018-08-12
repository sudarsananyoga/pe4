package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccur {
     public String Occur(String str,String str1) {
    	 	Pattern p= Pattern.compile(str1);
    	 	Matcher m=p.matcher(str);
    	 	String result="";
    	 	while(m.find()) {
    	 		result=result+"Found at:" +" "
    	 	          +m.start()+" - "+m.end();
    	 		}
    	 	return result;
    	 	}
     
}
