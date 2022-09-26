package com.fbaa.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopKMostFrequent {
	public Integer[] solution(Integer[] numbers, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		for (Integer n : numbers) {
			if (map.containsKey(n)) {
				int c = map.get(n);
				map.put(n, c + 1);
			} else {
				map.put(n, 1);
			}
		}
		TreeMap<Integer, List<Integer>> freq = new TreeMap<>();
		for (Integer e : map.keySet()) {
			if (!freq.containsKey(map.get(e))) {
				freq.put(map.get(e), new ArrayList<Integer>());
			}
			List<Integer> lst = freq.get(map.get(e));
			lst.add(e);
			freq.put(map.get(e), lst);
		}

		List<Integer> result = new ArrayList<>();
		Iterator<Integer> iterator = freq.descendingKeySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			List<Integer> list = freq.get(key);
			for (Integer el : list) {
				if (result.size() == k) {
					break;
				} else {
					result.add(el);
				}
			}
		}

		return result.toArray(new Integer[k]);
	}
}
