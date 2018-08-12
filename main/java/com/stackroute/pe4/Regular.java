package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
	public boolean check(String s,String t)
	{
		boolean result;
		Pattern p=Pattern.compile(t);
		Matcher m=p.matcher(s);
		if(m.find())
		     result=true;
		else
			  result=false;
		return result;
	}
}
