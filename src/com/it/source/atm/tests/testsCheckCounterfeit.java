package com.it.source.atm.tests;

import static org.junit.Assert.*;

import com.it.source.atm.logic.ATMLogic;

import org.junit.Before;
import org.junit.Test;

public class testsCheckCounterfeit {

	ATMLogic logic;

	 int arr [];

	@Before
	public void beforeTests() {
		logic = new ATMLogic();
	     arr = new int [] {1, 2, 5, 10, 20, 50, 100, 200, 500};
	}

	@Test
	public void testTrue() {
//		int arr[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500 };
		int value = 5;
		boolean result = logic.checkCounterfeit(value, arr);
		assertTrue(true == result);
	}

	@Test
	public void testFalse() {
//		int arr[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500 };
		int value = 9;
		boolean result = logic.checkCounterfeit(value, arr);
		assertFalse(true == result);
	}
}
