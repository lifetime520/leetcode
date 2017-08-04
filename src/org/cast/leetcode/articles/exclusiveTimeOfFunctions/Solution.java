package org.cast.leetcode.articles.exclusiveTimeOfFunctions;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[] exclusiveTime(int n, List<String> logs) {
		return calc(new int[n], logs, new ArrayList<>(), 0, 0, false);
	}
	public int[] calc(int[] ans, List<String> logs, List<Integer> stackStatus, int lastIdx, int lastTime, boolean isLastEnd) {
		if (logs.isEmpty()) return ans;
		String[] str = logs.remove(0).split(":");
		int s = Integer.valueOf(str[0]);
		int e = Integer.valueOf(str[2]);
		int diff = e - lastTime;
		if (str[1].equals("start")) {
			ans[isLastEnd ? s : lastIdx] += ((isLastEnd) ? 0 : diff);
			if (isLastEnd && !stackStatus.isEmpty())
				ans[stackStatus.get(stackStatus.size() - 1)] += diff - 1;
			else if (!isLastEnd && e != 0)
				stackStatus.add(lastIdx);
			return calc(ans, logs, stackStatus, s, e, false);
		} else {
			ans[s] += diff + (isLastEnd ? 0 : 1);
			if (isLastEnd && !stackStatus.isEmpty())
				stackStatus.remove(stackStatus.size() - 1);
			return calc(ans, logs, stackStatus, s, e, true);
		}
	}
}
