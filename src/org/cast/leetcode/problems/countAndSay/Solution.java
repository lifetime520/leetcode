package org.cast.leetcode.problems.countAndSay;

public class Solution {
	int[] counting = new int[10];
	public String countAndSay(int n) {
		if (n == 0) counting[0]++;
		while (n > 0) {
			int i = n % 10;
			counting[i]++;
			n /= 10;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 9; i >= 0; i--) {
			if (counting[i] == 0) {
				continue;
			} else {
				sb.append(counting[i]).append(i);
			}
		}
		return sb.toString();
	}
}
