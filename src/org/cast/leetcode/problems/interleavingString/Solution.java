package org.cast.leetcode.problems.interleavingString;

public class Solution {
	public boolean isInterleave(String s1, String s2, String s3) {
		int[][] memo = new int[s1.length()][s2.length()];
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				memo[i][j] = -1;
			}
		}
		return isInterleave(s1.toCharArray(), s2.toCharArray(), s3.toCharArray(), 0, 0, 0, memo);
	}

	public boolean isInterleave(char[] s1, char[] s2, char[] s3, int i1, int i2, int i3, int[][] memo) {
		if (s1.length == i1) {
			return equals(s2, i2, s3, i3);
		}
		if (s2.length == i2) {
			return equals(s1, i1, s3, i3);
		}
		if (s3.length == i3) {
			return s1.length == i1 && s2.length == i2;
		}
		if (memo[i1][i2] >= 0) {
			return memo[i1][i2] == 1;
		}

		boolean caseS1 = s1[i1] == s3[i3];
		boolean caseS2 = s2[i2] == s3[i3];
		boolean ans = false;
		if (caseS1 && caseS2) {
			ans = isInterleave(s1, s2, s3, i1 + 1, i2, i3 + 1, memo) || isInterleave(s1, s2, s3, i1, i2 + 1, i3 + 1, memo);
		} else if (caseS1) {
			ans = isInterleave(s1, s2, s3, i1 + 1, i2, i3 + 1, memo);
		} else if (caseS2) {
			ans = isInterleave(s1, s2, s3, i1, i2 + 1, i3 + 1, memo);
		} else {
			ans = false;
		}
		memo[i1][i2] = ans ? 1 : 0;
		return ans;
	}

	public boolean equals(char[] c1, int offer1, char[] c2, int offer2) {
		if (c1.length - offer1 != c2.length - offer2) return false;
		while (c2.length > offer2 && c1.length > offer1) {
			if (c1[offer1++] != c2[offer2++]) return false;
		}
		return true;
	}
}

class SolutionX {
	public boolean is_Interleave(String s1, int i, String s2, int j, String s3, int k, int[][] memo) {
		if (i == s1.length()) {
			return s2.substring(j).equals(s3.substring(k));
		}
		if (j == s2.length()) {
			return s1.substring(i).equals(s3.substring(k));
		}
		if (memo[i][j] >= 0) {
			return memo[i][j] == 1 ? true : false;
		}
		boolean ans = false;
		if (s3.charAt(k) == s1.charAt(i) && is_Interleave(s1, i + 1, s2, j, s3, k + 1, memo)
				|| s3.charAt(k) == s2.charAt(j) && is_Interleave(s1, i, s2, j + 1, s3, k + 1, memo)) {
			ans = true;
		}
		memo[i][j] = ans ? 1 : 0;
		return ans;
	}
	public boolean isInterleave(String s1, String s2, String s3) {
		int memo[][] = new int[s1.length()][s2.length()];
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				memo[i][j] = -1;
			}
		}
		return is_Interleave(s1, 0, s2, 0, s3, 0, memo);
	}
}