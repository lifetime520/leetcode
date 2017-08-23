package org.cast.leetcode.problems.binaryWatch;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private static String[][] mappingMinute = new String[6][];
	private static String[][] mappingHour = new String[4][];
	public List<String> readBinaryWatch(int num) {
		final List<String> list = new ArrayList<>();
		if (num > 10) return list;

		final int maxBdd = num > 3 ? 3 : num;
		final int minBdd = num - 5 >= 0 ? num - 5 : 0;
		for (int i = minBdd; i <= maxBdd; i++) {
			for (String hour : hour(i)) {
				for (String minute : minute(num - i)) {
					list.add(hour + ":" + minute);
				}
			}
		}
		return list;
	}

	private List<String> hour(int hour) {
		final List<String> list = new ArrayList<>();
		for (String s : mappingHour[hour]) {
			list.add(s);
		}
		return list;
	}

	private List<String> minute(final int minute) {
		final List<String> list = new ArrayList<>();
		for (String s : mappingMinute[minute]) {
			list.add(s);
		}
		return list;
	}

	static {
		mappingMinute[0] = new String[] {"00"};
		mappingMinute[1] = new String[] {"01", "02", "04", "08", "16", "32"};
		mappingMinute[2] = new String[] {"03", "05", "06", "09", "10", "12", "17", "18", "20", "24", "33", "34", "36", "40", "48"};
		mappingMinute[3] = new String[] {"07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"};
		mappingMinute[4] = new String[] {"15", "23", "27", "29", "30", "39", "43", "45", "46", "51", "53", "54", "57", "58"};
		mappingMinute[5] = new String[] {"31", "47", "55", "59"};
		mappingHour[0] = new String[] {"0"};
		mappingHour[1] = new String[] {"1", "2", "4", "8"};
		mappingHour[2] = new String[] {"3", "5", "6", "9", "10"};
		mappingHour[3] = new String[] {"7", "11"};
	}
}
