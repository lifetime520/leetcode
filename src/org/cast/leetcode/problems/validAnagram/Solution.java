package org.cast.leetcode.problems.validAnagram;

import java.util.Arrays;

public class Solution {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) return false;
		final char[] cs = s.toCharArray();
		final char[] ct = t.toCharArray();
		final int[] countS = new int[256];
		final int[] countT = new int[256];
		for (int i = 0; i < cs.length; i++) {
			countS[cs[i]]++;
			countT[ct[i]]++;
		}
		return Arrays.equals(countS, countT);
	}
}
