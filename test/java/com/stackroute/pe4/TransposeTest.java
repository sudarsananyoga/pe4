package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransposeTest {

	private static Transpose t;
	@BeforeClass
	public static void setup()
	{
		t=new Transpose();
	}
	@AfterClass
	public static void teardown()
	{
		t=null;
	}
	@Test
	public void test1()
	{
		String s1="apple is a fruit";
		String s2="elppa si a tiurf";
		String result=t.transpose(s2);
		assertEquals(s1,result);
	}
	@Test
	public void test2()
	{
		String s1="a quick brown fox jumps over the lazy dog";
		String s2="a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god";
		String result=t.transpose(s2);
		assertNotEquals(s1,result);
	}

}
