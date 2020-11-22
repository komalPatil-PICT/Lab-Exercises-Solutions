/**
 * 
 */
package com.cg.training.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Komal Patil
 *Create a method which accepts an array of integer elements and return 
 *the second smallest element in the array
 */
public class Exercise5 {

	public int getSecondSmallest(int[] arr)
	{
		List<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			list.add(i);
		}
		Collections.sort(list);
		
		return list.get(1);
	}
}
