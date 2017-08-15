package org.cast.leetcode.problems.romanToInteger;

public class Solution {
	
	public int romanToInt(String s) {
		int sum = 0;
		int lastNum = -1;
		for (char c : s.toCharArray()) {
			int thisNum = calcStrSymbal(c);
			if (lastNum == -1) {
				sum += thisNum;
			} else {
				if (lastNum >= thisNum) {
					sum += thisNum;
				} else {
					sum -= thisNum;
				}
				thisNum = -1;
			}
			lastNum = thisNum;
		}
		return sum;
	}

	private int calcStrSymbal(char str) {
		switch (str) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}
