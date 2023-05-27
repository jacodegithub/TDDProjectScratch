package com.packageforTDD.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LearningTDD {
	
	@Test
	public void checkValidString() {
		verifySum verify = new verifySum();
		int result = verify.checkSum("1");
		assertEquals(result, 1);
	}
	
	@Test
	public void checkInValidString() {
		verifySum verify = new verifySum();
		int result = verify.checkSum("");
		assertEquals(result, 0);
	}
}
