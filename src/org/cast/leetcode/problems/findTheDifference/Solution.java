package org.cast.leetcode.problems.findTheDifference;

public class Solution {
	public char findTheDifference(String s, String t) {
		char xor = 0;
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		int idx = 0;
		for (; idx < s.length(); idx++) {
			xor ^= cs[idx] ^= ct[idx];
		}
		xor ^= ct[idx];
		return xor;
	}

	public char findTheDifferenceByTwoLayer(String s, String t) {
		int[] counting = new int[256];
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		int idx = 0;
		for (; idx < s.length(); idx++) {
			counting[cs[idx]]--;
			counting[ct[idx]]++;
		}
		counting[ct[idx]]++;
		for (idx = 'a'; idx <= 'z'; idx++) {
			if (counting[idx] == 1) {
				return (char) idx;
			}
		}
		return '?';
	}
}
