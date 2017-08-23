package org.cast.leetcode.problems.setMismatch;

import java.util.Arrays;

public class Solution {
	public int[] findErrorNums(int[] nums) {
		int[] count = new int[nums.length + 1];
		int twice = 0;
		int lose = 0;
//		IntStream.range(0, nums.length).parallel().forEach(i -> count[nums[i]]++);
		for (int i : nums) {
			count[i]++;
		}
		for (int i = 1; i <= nums.length; i++) {
			if (count[i] == 0) lose = i;
			if (count[i] == 2) twice = i;
		}
		return new int[] {twice, lose};
	}
}

class SortedSolution {
	public int[] findErrorNums(int[] nums) {
		int diff = Arrays.stream(nums).sum() - (1 + nums.length) * nums.length / 2;
		int[] sorted = Arrays.stream(nums).sorted().toArray();
		int errorIdx = 0;
		for (int i = 0; i < nums.length; i++) {
			if (sorted[i + 1] == sorted[i]) {
				errorIdx = sorted[i];
				return new int[] {errorIdx, errorIdx - diff};
			}
		}
		return new int[] {0, 0};
	}
}