package com.packageforTDD.testing;
import java.util.List;
import java.util.ArrayList;
public class verifySum {
	public boolean checkSum(String str) {
		if(str.isEmpty()) return false;
		
		String[] numString = str.split(",");
		int total = 0, onum = 0;
		for(int i=0; i<numString.length; ++i) {
			onum = Integer.parseInt(numString[i]);
			total += onum;
		}
		if(total < 0) return false;
		return true;
	}
}
//if(Character.isLetter(str.charAt(0))) {
//	return false;
//}
//else {
//	int num = Integer.parseInt(str);
//	if(num < 0) return true;
//}
//
//return true;
//////if(!Character.isDigit(str.charAt(0))) return false;
//List<Integer> neg = new ArrayList<>();
//String[] st = str.split(",");
//for(int i=0; i<st.length; ++i) {
//	//if(!Character.isDigit(st[i].charAt(0))) return false;
//	int num = Integer.parseInt(st[i]);
//	if(num < 0) {
//		neg.add(num);
//	}
//}
//System.out.println(neg);
//return true;