package com.fbaa.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSums {
	public Integer[][] solution(Integer[] list, int target) {

		if (list == null || list.length < 3) {
			return new Integer[][] {};
		}

		List<Integer> numbers = Arrays.asList(list);
		Collections.sort(numbers, (a, b) -> a - b);
		int i = 0;
		int i0 = 1;
		int idx = list.length - 1;
		List<Integer[]> result = new ArrayList<>();
		while (i < idx) {
			if (i0 >= idx) {
				i++;
				i0 = i + 1;
				idx = list.length - 1;
			}
			int sum = numbers.get(i) + numbers.get(i0) + numbers.get(idx);
			if (sum == target) {
				result.add(new Integer[] { numbers.get(i), numbers.get(i0), numbers.get(idx) });
				i0++;
				idx--;
			} else if (sum < target) {
				i0++;
			} else {
				idx--;
			}
		}
		Integer[][] response = new Integer[result.size()][3];
		return result.toArray(response);
	}

}
