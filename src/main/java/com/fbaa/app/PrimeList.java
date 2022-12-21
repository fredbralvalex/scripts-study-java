package com.fbaa.app;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeList {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getPrimeList(10)));
	}
	
	public static int[] getPrimeList(int number) {
		return IntStream.range(1,number).filter(n -> isPrime(n)).toArray();
	}
	
	public static boolean isPrime(int value) {
		int index = 2;
		while (index <= value/2) {
			if (value%index == 0) {
				return false;
			}
			index++;
		}
		return true;
	}

}
