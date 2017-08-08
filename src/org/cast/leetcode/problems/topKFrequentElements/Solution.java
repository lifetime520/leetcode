package org.cast.leetcode.problems.topKFrequentElements;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Long> countMap = Arrays.stream(nums).parallel().mapToObj(i -> Integer.valueOf(i)).collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
		return countMap.entrySet().stream().sorted((e1, e2) -> {
			if (e1.getValue() >= e2.getValue()) {
				if (e1.getValue() == e2.getValue() && e1.getKey() < e2.getKey()) {
					return -1;
				} else {
					return e1.getValue() > e2.getValue() ? -1 : 1;
				}
			} else {
				return 1;
			}
		}).limit(k).map(entry -> entry.getKey()).collect(Collectors.toList());
	}
}
