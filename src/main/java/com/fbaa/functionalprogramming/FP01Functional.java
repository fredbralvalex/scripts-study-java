package com.fbaa.functionalprogramming;

import java.util.List;

public class FP01Functional {

	public static void main (String [] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
		printOddNumbersInListFunctional(numbers);
		printSquareOfEvenNumbersInListFunctional(numbers);
		printCubeOfOddNumbersInListFunctional(numbers);

	}

	static void print(int number) {
		System.out.println(number);
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		System.out.println();

		numbers.stream()
//			.forEach(number->print(number));
//			.forEach(FP01Functional::print);
			.forEach(System.out::println);
	}

	static boolean isEven(Integer number) {
		return number%2==0;
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		System.out.println();
		numbers.stream()
//			.filter(FP01Functional::isEven)
			.filter(number -> number%2 == 0)
			.forEach(System.out::println);
	}
	
	private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
		System.out.println();
		numbers.stream()
			.filter(number -> number%2 == 0)
			.map(number -> number*number)
			.forEach(System.out::println);
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		System.out.println();
		numbers.stream()
			.filter(number -> number%2 != 0)
			.forEach(System.out::println);
	}
	
	
	private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
		System.out.println();
		numbers.stream()
			.filter(number -> number%2 != 0)
			.map(number -> number*number*number)
			.forEach(System.out::println);
	}
	
}
