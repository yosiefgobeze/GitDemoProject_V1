package com.yosiefit.git.demo;

/*
 * An array is a collection of variables of the same data type
 * An array is an object in java
 * Array have a fixed size
 * An array variable is a reference object that points to the array object
 */

public class UpdateDemoApplication {

	public static void main(String[] args) {
		// basic array in java
		
		int[] numbers; // the array is null
		numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 3;
		numbers[2] = 4;
		numbers[3] = 2;
		numbers[4] = 6;
		
		// print the values
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
		
		// initializing an array
		float[] salaries = {7500.00f, 5200.58f, 6300.75f, 8000.65f};
		
		// printing the array variable will give the address of the array object not the values
		System.out.println(salaries);
	
		// float[] salaries;
		// salaries = {7500.00f, 5200.58f, 6300.75f, 8000.65f}; is an error
		
		/// accessing an array elements
		for(int i = 0; i < salaries.length; i++) {
			
			System.out.println(salaries[i] + " ");
		}
	}

}
