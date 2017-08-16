package org.cast.leetcode.problems.validPerfectSquare;

public class Solution {
	public boolean isPerfectSquare(int num) {
		final int target = newtonMethod(num);
		return target * target == num;
	}

	private int newtonMethod(int targetY) {
		double x0 = 1000.1D;
		int lastAns = -1;
		int thisAns = 0;
		while (thisAns != lastAns) {
			lastAns = thisAns;
			x0 -= (x0 - targetY / x0) * .5;
			thisAns = (int) x0;
		}
		return lastAns > 0 ? lastAns : -lastAns;
	}
}
