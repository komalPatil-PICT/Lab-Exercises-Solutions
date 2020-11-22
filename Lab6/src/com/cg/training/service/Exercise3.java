package com.cg.training.service;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author Komal Patil
 *accepts an array of numbers and returns the numbers and their squares in Hashmap
 */
public class Exercise3 {

	public Map<Integer, Integer> getSquare(Integer[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++)
		{
			map.put(arr[i], arr[i]*arr[i]);
		}
		return map;
	}
}
