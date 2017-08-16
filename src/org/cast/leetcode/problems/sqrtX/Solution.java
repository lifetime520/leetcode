package org.cast.leetcode.problems.sqrtX;

public class Solution {
	public int mySqrt(int x) {
		return newtonMethod(x);
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
