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
