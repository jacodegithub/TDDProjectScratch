package com.packageforTDD.testing;

public class verifySum {
	public long checkSum(String str) {
		if(str.isEmpty()) return 0;
		
		boolean newLineTag = str.contains("\n");
		boolean comma = str.contains(",");
		
		long sum = 0;
		if(comma && newLineTag) {
			String nstr = str.replace(",", "").replace("\n", "");
			for(char c : nstr.toCharArray()) {
				sum += Character.getNumericValue(c);
			}
		}
		else if(comma) {
			String nstr = str.replace(",", "");
			for(char c : nstr.toCharArray()) {
				sum += Character.getNumericValue(c);
			}
		}
		
		return sum;
	}
}
