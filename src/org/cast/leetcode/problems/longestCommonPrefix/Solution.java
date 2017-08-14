package org.cast.leetcode.problems.longestCommonPrefix;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		return lcp(strs, 0, null);
	}

	public String lcp(String[] ss, int index, String lcp) {
		if (lcp == null) {
			if (ss.length == 0) {
				return "";
			} else {
				return ss[0];
			}
		}

		if (ss.length == index) {
			return lcp;
		}

		if (ss.length > index) {
			
		}
		return null;
	}
}
