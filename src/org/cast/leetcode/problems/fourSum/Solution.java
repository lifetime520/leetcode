package org.cast.leetcode.problems.fourSum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Integer[] intNums = new Integer[nums.length];
		for (int i : nums) {
			intNums[i] = Integer.valueOf(i);
		}

		for (int i  = 0; i < nums.length - 2; i++) {
			for (int j  = i + 1; j < nums.length - 1; j++) {
				for (int k  = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> tmpList = Arrays.asList(intNums[i], intNums[j], intNums[k]);
						Collections.sort(tmpList);
					}
				}
			}
		}
		return null;
	}
}
