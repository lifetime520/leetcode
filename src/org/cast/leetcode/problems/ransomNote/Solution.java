package org.cast.leetcode.problems.ransomNote;

public class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		if (magazine.length() < ransomNote.length()) return false;
		final char[] rc = ransomNote.toCharArray();
		final char[] mc = magazine.toCharArray();

		final int[] counting = new int[26];
		for (int i = 0; i < rc.length; i++) {
			counting[rc[i] - 'a']++;
		}
		for (int i = 0; i < mc.length; i++) {
			counting[mc[i] - 'a']--;
		}
		for (int i : counting) {
			if (i > 0) {
				return false;
			}
		}
		return true;
	}

	public boolean canConstructByRuntimeCheck(String ransomNote, String magazine) {
		if (magazine.length() < ransomNote.length()) return false;

		int[] counting = new int[26];
		for (char m : magazine.toCharArray()) {
			counting[m - 'a']--;
		}
		for (char r : ransomNote.toCharArray()) {
			if (++counting[r - 'a'] > 0)
				return false;
		}
		return true;
	}
}
