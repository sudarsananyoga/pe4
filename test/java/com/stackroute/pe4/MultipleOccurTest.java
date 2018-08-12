package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultipleOccurTest {
	private static MultipleOccur m;

	@BeforeClass
	public static void setup()
	{
		m=new MultipleOccur();
	}
	@AfterClass
	public static void teardown()
	{
		m=null;
	}
	@Test
	public void test1()
	{
		String s1="She sells seashells by the seashore";
		String s2="se";
		String s3="Found at: 4 - 6Found at: 10 - 12Found at: 27 - 29";
		assertEquals(s3,m.Occur(s1,s2));
	}
	@Test
	public void test2()
	{
		String s1="heshahajakahes";
		String s2="he";
		String s3="Found at:0-5";
		assertNotEquals(s3,m.Occur(s1,s2));
	}
}
