/**
 * 
 */
package com.cg.training.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Komal Patil
 * Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal. 
	The input Hashmap contains the student registration number as key and mark as value. 
	The output Hashmap should contain the student registration number as key and the medal type as value.

 */
public class Exercise4 {

	/**
	 * 
	 * @param HashMap (HashMap<Long,Integer> hashmap)
	 * @return HashMap (HashMap<Long,String> map)
	 * 
	 * school offers medals to the students of tenth based on the following criteria 
		If(Marks>=90) : Gold 
		If(Marks between 80 and 90) : Silver 
		If(Marks between 70 and 80) : Bronze 

	 */
	public HashMap<Long,String> getStudents(HashMap<Long,Integer> hashmap)
	{
		HashMap<Long,String> map = new HashMap<>();
		for(Entry<Long, Integer> entry : hashmap.entrySet())
		{
			String medals = null;
			if(entry.getValue()>=90)
			{
				medals = new String("Gold");
			}
			else if(entry.getValue()>=80 && entry.getValue()<=90)
			{
				medals = new String("Silver");
			}
			else if(entry.getValue()>=70 && entry.getValue()<=80)
			{
				medals = new String("Bronze");
			}
			else
			{
				medals = new String ("NA");
			}
			map.put(entry.getKey(), medals);
		}
		return map;
	}

}
