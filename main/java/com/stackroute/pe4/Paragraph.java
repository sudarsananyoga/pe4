package com.stackroute.pe4;

import java.util.Arrays;

public class Paragraph {
  public String transpose(String str) {
	  char Arr[]=str.toCharArray();
	  Arrays.sort(Arr);
	  return new String(Arr);
	  
  }
}
