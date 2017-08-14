package org.cast.leetcode.problems.powerOfTwo;

public class Solution {
	public boolean isPowerOfTwo(int n) {
		if (n > 0 && (n &= n - 1) >= 0) {
			return n == 0;
		}
		return false;
	}
}
