package org.cast.leetcode.articles.exclusiveTimeOfFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExclusiveTimeOfFunctions {
	public static String[] PATTERN_1 = {"0:start:0", "1:start:2", "1:end:5", "0:end:6"};
	public static String[] PATTERN_2 = {"0:start:0", "1:start:2", "1:end:5", "2:start:6", "2:end:7", "0:end:9"};
	public static String[] PATTERN_3 = {"0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7"};

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Arrays.stream(PATTERN_1).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(2, list))); // [3, 4]

		Arrays.stream(PATTERN_2).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(3, list))); // [4, 4, 2]

		Arrays.stream(PATTERN_3).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(1, list))); // [8]
	}

}

class Solution {
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
			if (isLastEnd)
				stackStatus.remove(stackStatus.size() - 1);
			return calc(ans, logs, stackStatus, s, e, true);
		}
	}
}
