package org.cast.leetcode.problems.palindromeNumber;

public class PalindromeNumber {
	public static int PATTERN_1 = -1;
	public static int PATTERN_2 = 991101199;
	public static int PATTERN_3 = 99111199;

	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(PATTERN_1)); // false

		System.out.println(new Solution().isPalindrome(PATTERN_2)); // true

		System.out.println(new Solution().isPalindrome(PATTERN_3)); // true
	}
}