package org.cast.leetcode.problems.validParentheses;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		final char[] stackArr = new char[s.length()];
		int stackIdx = -1;
		int idx = 0;
		while (idx < s.length()) {
			final char c = s.charAt(idx++);
			if (isClosed(c)) {
				if (stackIdx == -1) return false;

				final char tmpC = stackArr[stackIdx];
				if (isPair(tmpC, c)) {
					stackIdx--;
				} else {
					return false;
				}
			} else {
				stackArr[++stackIdx] = c;
			}
		}
		return stackIdx == -1;
	}

	private boolean isClosed(final char c) {
		switch (c) {
		case ')':
			return true;
		case ']':
			return true;
		case '}':
			return true;

		default:
			return false;
		}
	}

	private boolean isPair(final char startC, final char endC) {
		switch (startC) {
		case '(':
			return endC == ')';
		case '[':
			return endC == ']';
		case '{':
			return endC == '}';

		default:
			return false;
		}
	}

	public boolean isValidByStack(String s) {
		final Stack<Character> stack = new Stack<>();
		int idx = 0;
		while (idx < s.length()) {
			final char c = s.charAt(idx++);
			if (isClosed(c)) {
				if (stack.isEmpty()) return false;

				final Character objC = stack.peek();
				if (isPair(objC.charValue(), c)) {
					stack.pop();
				} else {
					return false;
				}
			} else {
				stack.push(Character.valueOf(c));
			}
		}
		return stack.isEmpty();
	}
}
