package com.cg.training.service;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author Komal Patil
 * Create a method that accepts a character array and count the number of times 
 * each character is present in the array.
 */
public class Exercise2 {

	/**
	 * @param arr (char array)
	 * @return Map
	 * this method accept array of characters 
	 * calculate number of occurrences of each character and store in map
	 */
	public Map<Character, Integer> countChars(char[] arr) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : arr) {
			Integer j = map.get(ch);
			map.put(ch, (j == null) ? 1 : (j + 1));
		}
		return map;

	}
}
