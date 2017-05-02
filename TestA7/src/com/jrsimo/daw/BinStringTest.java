package com.jrsimo.daw;

import static org.junit.Assert.*;
import junit.framework.*;

import org.junit.Before;
import org.junit.Test;

public class BinStringTest 
{

	private BinString binString;
	
	public BinStringTest ()
	{
		//debe haber un constructor publico vacio
	}
	
	protected void setUp(){
		binString=new BinString();
	}
	
	@Test
	public void testSumFunction()
	{
		int expected=0;
		assertEquals(expected, binString.sumar(""));
		expected=100;
		assertEquals(expected, binString.sumar("d"));
		expected=265;
		assertEquals(expected, binString.sumar("Add"));
	}
	
	@Test
	public void testTotalConversion()
	{
		String expected ="1000001";
		assertEquals(expected, binString.convertir("A"));
	}
	
	
}
