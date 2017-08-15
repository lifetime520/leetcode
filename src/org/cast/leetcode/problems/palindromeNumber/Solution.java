package org.cast.leetcode.problems.palindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0) return false;
		long reverse = Long.valueOf(new StringBuilder().append(String.valueOf(x)).reverse().toString()).longValue();
		return reverse == x;
	}
}
