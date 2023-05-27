package com.packageforTDD.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

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
		result = verify.checkSum("2\n4\n1");
		assertEquals(7, result);
	}
	
	 
	public void checkForSingleNegativeNumberInTheString() {
		verifySum verify = new verifySum();
		
		NumberFormatException exception = assertThrows(NumberFormatException.class, 
				() -> {
					verify.checkSum("1,-2,4");
				});
		assertEquals("Negatives are not allowed", exception.getMessage());
	}
	
	@Test 
	public void checkForMultipleNegativeNumberInTheString() {
		verifySum verify = new verifySum();
		
		NumberFormatException exception = assertThrows(NumberFormatException.class, 
				() -> {
					verify.checkSum("1,-2,-2,-3,-6,4");
				});
		List<Integer> list = verify.getNegativeNumbers(exception);
		//System.out.println("test "+list);
		List<Integer> negNumbers = Arrays.asList(-2,-2,-3,-6);
		assertEquals(list, negNumbers);
	}
	
	@Test 
	public void checkForMultipleNegativeWithNewLineNumberInTheString() {
		verifySum verify = new verifySum();
		
		NumberFormatException exception = assertThrows(NumberFormatException.class, 
				() -> {
					verify.checkSum("1,-2\n-2,-3,-6,4");
				});
		List<Integer> list = verify.getNegativeNumbers(exception);
		//System.out.println("test "+list);
		List<Integer> negNumbers = Arrays.asList(-2,-2,-3,-6);
		assertEquals(list, negNumbers);
	}
}
