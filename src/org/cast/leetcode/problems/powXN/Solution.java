package org.cast.leetcode.problems.powXN;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public double myPow(double x, int n) {
 		long tmpIdx = Math.abs((long) n);
		double ans = pow(x, tmpIdx);
		return n >= 0 ? ans : 1 / ans;
	}

	private double pow(double x, long n) {
		Map<Long, Double> tmp = new HashMap<>();
		tmp.put(Long.valueOf(0), 1D);
		tmp.put(Long.valueOf(1), x);

		Long idx = Long.valueOf(n);
		if (tmp.containsKey(idx)) {
			return tmp.get(idx);
		}

		double ans = 1D;
		long tmpIdx = 2;
		while (n >= tmpIdx) {
			final Long thisIdx = Long.valueOf(tmpIdx);
			final Long lastIdx = Long.valueOf(tmpIdx >> 1);

			tmp.put(thisIdx, tmp.get(lastIdx) * tmp.get(lastIdx));
			if ((n & tmpIdx) > 0) {
				ans *= tmp.get(thisIdx) ;
			}
			tmpIdx <<= 1;
		}
		return (n & 0x1) == 1 ? ans * x : ans;
	}
}
