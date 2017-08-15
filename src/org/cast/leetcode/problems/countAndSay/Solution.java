package org.cast.leetcode.problems.countAndSay;

public class Solution {
	public String countAndSay(int n) {
		String ans = "1";
		for (int i = n; i > 1; i--) {
			ans = countAndSay(ans);
		}
		return ans;
	}

	public String countAndSay(String n) {
		int idx = 0;
		char tmp = 0;
		int counting = 0;
		StringBuilder sb = new StringBuilder();
		while (n.length() != idx) {
			char c = n.charAt(idx++);
			if (c == tmp || tmp == 0) {
				counting++;
			} else {
				sb.append(counting).append(tmp);
				counting = 1;
			}
			tmp = c;
		}
		if (counting != 0) {
			sb.append(counting).append(tmp);
		}
//		System.out.println(n + " => " + sb.toString());
		return sb.toString();
	}
}
