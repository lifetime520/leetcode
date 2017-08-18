package org.cast.leetcode.problems.firstUniqueCharacterInAString;

public class Solution {
	public int firstUniqChar(String s) {
		if (s.length() == 0) return -1;

		char[] cs = s.toCharArray();
		int[] counting = new int[26];
		int[] indexing = new int[26];
		for (int i = 0; i < cs.length; i++) {
			final int idx = cs[i] - 'a';
			counting[idx]++;
			indexing[idx] = i;
		}
		for (int i = 0; i < cs.length; i++) {
			final int idx = cs[i] - 'a';
			if (counting[idx] == 1)
				return indexing[idx];
		}
		return -1;
	}
}
