package org.cast.leetcode.problems.isomorphicStrings;

public class Solution {
	public boolean isIsomorphic(final String s, final String t) {
		final int[] m1 = new int[256];
		final int[] m2 = new int[256];
		final char[] cs = s.toCharArray();
		final char[] ct = t.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (m1[cs[i]] != m2[ct[i]]) return false;
			m1[cs[i]] = m2[ct[i]] = i + 1;
		}
		return true;
	}
}
