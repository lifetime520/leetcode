package org.cast.leetcode.problems.rangeSumQueryImmutable;

public class NumArray {
	final int[] ans;
	public NumArray(final int[] nums) {
		if (nums.length != 0)
			for (int i = 1; i < nums.length; i++)
				nums[i] += nums[i - 1];
		ans = nums;
	}

	public int sumRange(int i, final int j) {
		if (i-- == 0)
			return ans[j];
		return ans[j] - ans[i];
	}
}
