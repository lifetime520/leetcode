package org.cast.leetcode.problems.sumOfTwoIntegers;

public class Solution {
	public int getSum(int a, int b) {
		if (b == 0) return a;
		int shift = a & b;
		int sum = a ^ b;
		return getSum(sum, (shift << 1));
	}
}
