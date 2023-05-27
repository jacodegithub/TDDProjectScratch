package com.packageforTDD.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LearningTDD {
	
	@Test
	public void checkForEmptyString() {
		verifySum verify = new verifySum();
		boolean result = verify.checkSum("");
		assertFalse(result);
	}
	
	@Test
	public void checkVForNonEmptyString() {
		verifySum verify = new verifySum();
		boolean result = verify.checkSum("\n()+-;1;2");
		assertTrue(result);
	}
}
