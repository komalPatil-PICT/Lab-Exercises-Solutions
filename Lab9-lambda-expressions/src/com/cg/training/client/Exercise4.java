/**
 * 
 */
package com.cg.training.client;

import java.util.function.Supplier;

import com.cg.training.service.Person;

/**
 * @author Komal Patil
 * Write a class with main method to demonstrate instance creation using method reference.
 */
public class Exercise4 {

	static Supplier<Person> person = () -> new Person("Komal", 22, "F");

	public static void main(String[] args) {

		System.out.println(person.get());
	}

}
