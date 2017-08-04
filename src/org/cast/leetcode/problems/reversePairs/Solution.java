package org.cast.leetcode.problems.reversePairs;

public class Solution {
	public int reversePairs(int[] nums) {
		int count = 0;
		for (int j = nums.length - 1; j > 0; j--) {
			for (int i = j - 1; i >= 0; i--) {
				if (nums[i] >= nums[j] && nums[i] / 2. > nums[j]) {
					count++;
				}
//				System.out.printf("%d, %d , count : %d\n", nums[i], nums[j] , count);
			}
		}
		return count;
	}
}
