package org.cast.leetcode.problems.judgeRouteCircle;

public class Solution {
	public boolean judgeCircle(String moves) {
		int[] coord = new int[127];
		final char[] cs = moves.toCharArray();
		for (char c : cs)
			coord[c]++;
		return coord['U'] == coord['D'] && coord['L'] == coord['R'];
	}
}

class SolutionByMoving {
	public boolean judgeCircle(String moves) {
		int[] coord = new int[] {0, 0};
		final char[] cs = moves.toCharArray();
		for (char c : cs) {
			switchCoorShift(c, coord);
		}
		return coord[0] == 0 && coord[1] == 0;
	}

	public void switchCoorShift(char c, int[] coord) {
		switch (c) {
		case 'U':
			coord[1]++;return ;
		case 'D':
			coord[1]--;return ;
		case 'L':
			coord[0]--;return ;
		case 'R':
			coord[0]++;return ;
		}
	}
}
