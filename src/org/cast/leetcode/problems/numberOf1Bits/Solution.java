package org.cast.leetcode.problems.numberOf1Bits;

public class Solution {
	public int hammingWeight(int n) {
		if (n == 0) return 0;
		int counting = 1;
		while ((n &= n -1) != 0) {
			counting++;
		}
		return counting;
	}
}
