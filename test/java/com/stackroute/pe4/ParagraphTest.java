package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ParagraphTest {

	private static Paragraph p;

	@BeforeClass
	public static void setup()
	{
		p=new Paragraph();
	}
	@AfterClass
	public static void teardown()
	{
		p=null;
	}
    @Test
    public void test1()
    {
    	String s1="stackroute";
    	String s2="acekorsttu";
    	assertEquals(s2,p.transpose(s2));
    }
    @Test
    public void test2()
    {
    	String s1="stackroute";
    	String s2="strouteack";
    	assertNotEquals(s2,p.transpose(s2));
    }
}
