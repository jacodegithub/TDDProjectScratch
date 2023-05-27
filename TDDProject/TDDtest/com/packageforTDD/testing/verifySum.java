package com.packageforTDD.testing;

import java.util.List;
import java.util.ArrayList;

public class verifySum {
	private List<Integer> list = new ArrayList<>();
	public long checkSum(String str) {
		if(str.isEmpty()) return 0;
		
		boolean doubleSlach = str.contains("//");
		boolean newLineTag = str.contains("\n");
		boolean comma = str.contains(",");
		
		long sum = 0;
		if(doubleSlach) {
			String nstr = str.replace("//", "").replace(";", "").replace("\n", "");
			for(char c : nstr.toCharArray()) {
				if(Character.getNumericValue(c) < 0) {
					list.add(Character.getNumericValue(c));
				}
				sum += Character.getNumericValue(c);
			}
			if(list.size() == 1) throw new IllegalArgumentException("Negatives are not allowed");
		}
		if(comma && newLineTag) {
			String nstr = str.replace(",", "").replace("\n", "");
			for(char c : nstr.toCharArray()) {
				if(Character.getNumericValue(c) < 0) {
					list.add(Character.getNumericValue(c));
				}
				sum += Character.getNumericValue(c);
			}
			if(list.size() == 1) throw new IllegalArgumentException("Negatives are not allowed");
		}
		else if(newLineTag) {
			String nstr = str.replace("\n", "");
			for(char c : nstr.toCharArray()) {
				if(Character.getNumericValue(c) < 0) {
					list.add(Character.getNumericValue(c));
				}
				sum += Character.getNumericValue(c);
			}
			if(list.size() == 1) throw new IllegalArgumentException("Negatives are not allowed");
		}
		else if(comma) {
			String nstr = str.replace(",", "");
			for(char c : nstr.toCharArray()) {
				if(Character.getNumericValue(c) < 0) {
					list.add(Character.getNumericValue(c));
				}
				sum += Character.getNumericValue(c);
			}
			if(list.size() == 1) throw new IllegalArgumentException("Negatives are not allowed");
		}
		
		return sum;
	}
}
