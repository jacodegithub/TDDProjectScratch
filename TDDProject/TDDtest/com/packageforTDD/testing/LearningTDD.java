package com.packageforTDD.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LearningTDD {

	@Test
	public void checkValidNumbers() {
		verifySum verify = new verifySum();
		boolean result = verify.checkSum("1");
		assertTrue(result, "first value");
		result = verify.checkSum("1,2");
		assertTrue(result, "second value");
	}
	
	@Test
	public void checkInvalidNumbers() {
		verifySum verify = new verifySum();
		boolean result = verify.checkSum("");
		assertFalse(result);
	}

}
