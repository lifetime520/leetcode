package org.cast.leetcode.problems.assignCookies;

import java.util.Arrays;

public class Solution {
	public int findContentChildren(int[] g, int[] s) {
		if (g.length == 0 || s.length == 0) return 0;
		Arrays.sort(g);
		Arrays.sort(s);

		int gIdx = 0;
		int sIdx = 0;
		int count = 0;
		while (sIdx < s.length && gIdx < g.length) {
			if (s[sIdx] >= g[gIdx]) {
				count++;
				gIdx++;
			}
			sIdx++;
		}
		return count;
	}
}
