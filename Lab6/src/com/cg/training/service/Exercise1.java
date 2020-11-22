package com.cg.training.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author Komal Patil
 *Create a method which accepts a hash map and return 
 *the values of the map in sorted order as a List.
 */
public class Exercise1 {


	/**
	 * 
	 * @param hashMap
	 * @return List
	 * This method accept HashMap<Integer,String>
	 * list stores values of map and return sorted list
	 */
	public List<String> getMapValues(HashMap<Integer,String> hashMap)
	{
		List<String> list = new ArrayList<>(hashMap.values());
		Collections.sort(list);
		return list;
		
	}
}
