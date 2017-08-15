package org.cast.leetcode.problems.longestCommonPrefix;

public class Solution {
	public String longestCommonPrefix(final String[] strs) {
		if (strs.length == 0)
			return "";
		return lcp(strs, 1, strs[0]);
	}

	private String lcp(final String[] ss, final int index, final String lcp) {
		if (ss.length == index) {
			return lcp;
		} else if (ss.length > index) {
			if (ss[index].length() > lcp.length())
				return lcp(ss, index + 1, lcp(ss[index], lcp));
			else
				return lcp(ss, index + 1, lcp(lcp, ss[index]));
		} else {
			return "";
		}
	}

	private String lcp(final String largestStr, final String smallStr) {
		if (smallStr.length() == 0) return "";
		int idx = smallStr.length() - 1;
		int failMatch = -1;
		while (idx >= 0) {
			if (largestStr.charAt(idx) == smallStr.charAt(idx)) {
				if (failMatch == 0) {
					failMatch = idx + 1;
				}
			} else {
				failMatch = 0;
			}
			idx--;
		}
		if (failMatch == -1) {
			return smallStr;
		} else if (failMatch == 0) {
			return "";
		} else {
			return smallStr.substring(0, failMatch);
		}
	}
}
