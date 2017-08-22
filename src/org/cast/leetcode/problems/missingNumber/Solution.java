package org.cast.leetcode.problems.missingNumber;

public class Solution {
	public int missingNumber(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[0] ^= i ^ nums[i];
		}
		return nums[0] ^ nums.length;
	}

	public int missingNumberBySum(int[] nums) {
		nums[0] -= (nums.length * (nums.length + 1)) >> 1;
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		return - nums[nums.length - 1];
	}
}
