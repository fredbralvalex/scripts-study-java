package com.fbaa.app;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		String text = "Programming";
		
//		Map<String, Integer> map = new HashMap<>();
		List<String> list = Arrays.asList(text.split(""));
		Map<String, List<String>> result = list.stream()
				.collect(Collectors.groupingBy(Function.identity()));
		
		result.values().stream().count();
		System.out.println(result);
	}
}
