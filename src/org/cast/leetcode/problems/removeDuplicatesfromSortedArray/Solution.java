package org.cast.leetcode.problems.removeDuplicatesfromSortedArray;

public class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
		int shift = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[shift]) {
				shift++;
				nums[shift] = nums[i];
			}
		}
		return shift + 1;
	}
}
