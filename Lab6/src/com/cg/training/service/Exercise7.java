/**
 * 
 */
package com.cg.training.service;

import java.util.Arrays;

/**
 * @author Komal Patil
 *Accept and integer array, reverse the numbers in the array, 
 *sort it and return the resulting array. 
 */
public class Exercise7 {

	public int[] getSorted(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			StringBuffer str = new StringBuffer(Integer.toString(arr[i]));
			arr[i] = Integer.parseInt(new String(str.reverse()));
		}

		Arrays.sort(arr);
		return arr;
	}
}
