package com.packageforTDD.testing;

public class verifySum {
	public long checkSum(String str) {
		if(str.isEmpty()) return 0;
		
		boolean doubleSlach = str.contains("//");
		boolean newLineTag = str.contains("\n");
		boolean comma = str.contains(",");
		
		long sum = 0, cnt = 0;
		if(doubleSlach) {
			String nstr = str.replace("//", "").replace(";", "").replace("\n", "");
			for(char c : nstr.toCharArray()) {
				if(Character.getNumericValue(c) < 0) {
					throw new IllegalArgumentException("Negatives are not allowed");
				}
				sum += Character.getNumericValue(c);
			}
		}
		if(comma && newLineTag) {
			String nstr = str.replace(",", "").replace("\n", "");
			for(char c : nstr.toCharArray()) {
				if(Character.getNumericValue(c) < 0) {
					throw new IllegalArgumentException("Negatives are not allowed");
				}
				sum += Character.getNumericValue(c);
			}
		}
		else if(newLineTag) {
			String nstr = str.replace("\n", "");
			for(char c : nstr.toCharArray()) {
				if(Character.getNumericValue(c) < 0) {
					throw new IllegalArgumentException("Negatives are not allowed");
				}
				sum += Character.getNumericValue(c);
			}
		}
		else if(comma) {
			String nstr = str.replace(",", "");
			for(char c : nstr.toCharArray()) {
				if(Character.getNumericValue(c) < 0) {
					throw new IllegalArgumentException("Negatives are not allowed");
				}
				sum += Character.getNumericValue(c);
			}
		}
		
		return sum;
	}
}
