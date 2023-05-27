package com.packageforTDD.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LearningTDD {
	
	@Test
	public void checkForEmptyString() {
		verifySum verify = new verifySum();
		long result = verify.checkSum("");
		assertEquals(0, result);
	}	

	@Test
	public void checkForTheSumOfNumbersInStringSeparatedByComma() {
		verifySum verify = new verifySum();
		long result = verify.checkSum("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void checkForTheSumOfNumbersInStringNewLineTag() {
		verifySum verify = new verifySum();
		long result = verify.checkSum("1\n2,3");
		assertEquals(6, result);
	}
}
