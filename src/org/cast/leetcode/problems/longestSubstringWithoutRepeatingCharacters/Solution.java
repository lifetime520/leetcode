package org.cast.leetcode.problems.longestSubstringWithoutRepeatingCharacters;

public class Solution {
	private char[] chars;
	public int lengthOfLongestSubstring(String s) {
		chars = s.toCharArray();
		int maxLength = 0;
		for (int i = 0; i < chars.length; i++) {
			int tmp = lengthOfLongestSubstring(i);
			if (tmp > maxLength) {
				maxLength = tmp;
			}
		}
		return maxLength;
	}

	public int lengthOfLongestSubstring(int i) {
		boolean[] compare = new boolean[128];
		byte counting = 0;
		for (int j = i; j < chars.length; j++) {
			int bit = chars[j];
			if (!compare[bit]) {
				compare[bit] = true;
				counting++;
			} else {
				return counting;
			}
		}
		return counting;
	}
}