package com.it.source.atm.tests;

import static org.junit.Assert.*;

import com.it.source.atm.collections.Box;
import com.it.source.atm.logic.ATMLogic;
import com.it.source.atm.moneys.Hryvnia;

import org.junit.Before;
import org.junit.Test;

public class TestsCheckCounterfeit {

	ATMLogic logic;
	int arr[];
	Box boxHryvnia;

	@Before
	public void beforeTests() {
		boxHryvnia = new Box();
		logic = new ATMLogic(boxHryvnia);
		arr = new int[] { 1, 2, 5, 10, 20, 50, 100, 200, 500 };
	}

	@Test
	public void testTrue() {
		int value = 5;
		boolean result = logic.checkCounterfeit(value, arr);
		assertTrue(true == result);
	}

	@Test
	public void testFalse() {
		int value = 9;
		boolean result = logic.checkCounterfeit(value, arr);
		assertFalse(true == result);
	}
}
