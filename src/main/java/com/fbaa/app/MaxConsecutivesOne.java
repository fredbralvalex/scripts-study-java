package com.fbaa.app;

public class MaxConsecutivesOne {

	public int maxConsecutives(Integer[] numbers, int joker) {
		if (numbers.length == 0) {
			return 0;
		}
		int count = joker;
		int i = 0;
		int i0 = 0;
		for (; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				count--;
			}
			if (count < 0) {
				if (numbers[i0] == 0) {
					count++;
				}
				i0++;
			}
		}

		return i - i0;
	}
}
