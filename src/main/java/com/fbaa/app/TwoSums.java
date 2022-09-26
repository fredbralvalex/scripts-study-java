package com.fbaa.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSums {
	public Integer[] solution(Integer[] lst, int target) {
		if (lst.length == 0 || lst.length < 2) {
			return new Integer[] {};
		}
		List<Integer> list = Arrays.asList(lst);
		Collections.sort(list, (a, b) -> a - b);
		int i = 0;
		int idx = list.size() - 1;
		Integer[] result = new Integer[] {};
		while (i < idx) {
			int sum = list.get(i) + list.get(idx);
			if (sum == target) {
				result = new Integer[] { list.get(i), list.get(idx) };
				idx = idx - 1;
			} else if (sum > target) {
				idx = idx - 1;
			} else {
				i = i + 1;
			}
		}

		return result;
	}
}
