package com.cg.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Komal Patil
 *Create a method which accepts the id and the age 
 *of people as a Map and decide if they are eligible for vote.
 *A person is eligible for vote if his age is greater than 18. 
 *Add the IDs of all the eligible persons to list and return the list. 
 */
public class Exercise6 {
	public List<Long> votersList(Map<Long,Integer> voterDetails)
	{
		List<Long> list = new ArrayList<>();
		
	    for (Map.Entry<Long,Integer> entry: voterDetails.entrySet()) { 
            Long voterId = entry.getKey();
            Integer voterAge =entry.getValue();
            
            if(voterAge > 18)
            	list.add(voterId);
        }
	    
	    return list;
	}
}
