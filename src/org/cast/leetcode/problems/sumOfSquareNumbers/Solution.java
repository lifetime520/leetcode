package org.cast.leetcode.problems.sumOfSquareNumbers;

public class Solution {
	public boolean judgeSquareSum(int c) {
		if (c == 0) return true;
		int partRightNum = (int) Math.sqrt(c) + 1;
		int partLeftNum = 0;
		while (partLeftNum <= partRightNum) {
			int diffSum = c - partLeftNum * partLeftNum - partRightNum * partRightNum;
			if (diffSum == 0) {
				return true;
			} else if (diffSum > 0) {
				partLeftNum++;
			} else {
				partRightNum--;
			}
		}
		return false;
	}

	public boolean SquareOfJudgeSquareSum(int c) {
		if (c == 0) return true;
		int partNum = (int) Math.sqrt(c);
		int squarePartNum = partNum * partNum;
		while (partNum >= 0) {
			int diff = c - squarePartNum;
			int sqrtDiff = (int) Math.sqrt((double) diff);
			if (sqrtDiff * sqrtDiff == diff) {
				return true;
			}
			partNum--;
			squarePartNum = partNum * partNum;
		}
		return false;
	}
}
