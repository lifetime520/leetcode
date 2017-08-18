package org.cast.leetcode.problems.happyNumber;

public class Solution {
	public boolean isHappy(int n) {
		final int[] xor = new int[1000];
		do {
			if (n == 1 || n == 7) return true;
			if (n < 10) return false;
			n = divideNum(n);
		} while ((xor[n] ^= 0x01) != 0);
		return false;
	}

	private final int[] squareMapping = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81};
	private int divideNum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += squareMapping[n % 10];
			n /= 10;
		}
		return sum;
	}
}
