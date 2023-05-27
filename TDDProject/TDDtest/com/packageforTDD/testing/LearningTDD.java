package com.packageforTDD.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LearningTDD {
	
	@Test
	public void checkEmptyStringNumber() {
		verifySum verify = new verifySum();
		boolean result = verify.checkSum("");
		assertFalse(result);
	}

	@Test
	public void checkValidNumbersWithCommasAsDelimiters() {
		verifySum verify = new verifySum();
		boolean result = verify.checkSum("1");
		assertTrue(result, "first value");
		result = verify.checkSum("1,2");
		assertTrue(result, "second value");
	}
	
	@Test
	public void checkValidNumbersWithSemiColonAsDelimiters() {
		verifySum verify = new verifySum();
		boolean result = verify.checkSum("1;2;3");
		assertTrue(result);
	}
	
	@Test
	public void checkValidNumbersWithDifferentDelimiters() {
		verifySum verify = new verifySum();
		boolean result = verify.checkSum("//(;+)1;2;3");
		assertTrue(result);
	}

}
