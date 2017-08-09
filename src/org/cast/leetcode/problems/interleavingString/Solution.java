package org.cast.leetcode.problems.interleavingString;

public class Solution {
	public String reverseString(String s) {
		char[] cs = new char[s.length()];
		int i = s.length() - 1;
		for (char c : s.toCharArray()) {
			cs[i--] = (char) c;
		}
		return new String(cs);
	}
}