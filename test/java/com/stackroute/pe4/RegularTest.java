package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegularTest {
private static Regular r;

@BeforeClass
public static void setup()
{
	r=new Regular();
}
@AfterClass
public static void teardown()
{
	r=null;
}
@Test
	public void test1()
	{
	String s1="This is Harry";
	String s2="Harry";
	boolean result=r.check(s1, s2);
	assertEquals(true,result);
	}
@Test
public void test2()
{
String s1="Is Henry here?";
String s2="Harry";
boolean result=r.check(s1, s2);
assertNotEquals(true,result);
}
}
