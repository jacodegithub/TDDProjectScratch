package com.packageforTDD.testing;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class verifySum {
	private List<Integer> list = new ArrayList<>();
	public long checkSum(String str) {
		if(str.isEmpty()) return 0;
		
		boolean doubleSlach = str.contains("//");
		boolean newLineTag = str.contains("\n");
		boolean negativeSign = str.contains("-");
		boolean comma = str.contains(",");
		
		long sum = 0;
		if(doubleSlach) {
			String nstr = str.replaceAll("[^-0-9]", ",");
			for(String s : nstr.split(",")) {
				if(Integer.parseInt(s) < 0) {
					list.add(Integer.parseInt(s));
				}
				else sum += Integer.parseInt(s);
			}
			if(list.size() == 1) throw new NumberFormatException("Negatives are not allowed");
			else if(list.size() > 1) throw new NumberFormatException("Negatives are not allowed :"+list);
		}
		if(comma && newLineTag) {
//			String nstr = str.replace(",", "").replace("\n", "");
			String nstr = str.replaceAll("[^-0-9]", ",");
			for(String s : nstr.split(",")) {
				if(Integer.parseInt(s) < 0) {
					list.add(Integer.parseInt(s));
				}
				else sum += Integer.parseInt(s);
			}
			if(list.size() == 1) throw new NumberFormatException("Negatives are not allowed");
			else if(list.size() > 1) throw new NumberFormatException("Negatives are not allowed :"+list);
		}
		else if(newLineTag) {
			String nstr = str.replaceAll("[^-0-9]", ",");
			for(String s : nstr.split(",")) {
				if(Integer.parseInt(s) < 0) {
					list.add(Integer.parseInt(s));
				}
				else sum += Integer.parseInt(s);
			}
			if(list.size() == 1) throw new NumberFormatException("Negatives are not allowed");
			else if(list.size() > 1) throw new NumberFormatException("Negatives are not allowed :"+list);
		}
		else if(comma) {
			String nstr = str.replaceAll("[^-0-9]", ",");
//			System.out.println("nstr "+ nstr);
			for(String s : nstr.split(",")) {
				//System.out.print("n "+Integer.parseInt(s)+" ");
				if(Integer.parseInt(s) < 0) {
//					System.out.println(Integer.parseInt(s));
					list.add(Integer.parseInt(s));
				}
				else sum += Integer.parseInt(s);
			}
			//System.out.println("list "+list);
			if(list.size() == 1) throw new NumberFormatException("Negatives are not allowed");
			else if(list.size() > 1) throw new NumberFormatException("Negatives are not allowed :"+list);
		}
		
		return sum;
	}
	
	public List<Integer> getNegativeNumbers(NumberFormatException exception) {
		List<Integer> list = new ArrayList<>();
		String message = exception.getMessage();
//		System.out.println(message);
		String[] parts = message.split(" :");
//		System.out.println("this "+Arrays.toString(parts));
		String negativeNumberList = parts[1].replaceAll("[^-,0-9]", "");
//		System.out.println("neg "+negativeNumberList);
		for(String num : negativeNumberList.split(",")) {
			list.add(Integer.parseInt(num));
		}
		
//		System.out.println("check "+list);
		return list;
	}
}
