package com.ExerciseSortArrays.add;

import java.util.Random;

public class InsertionSortArray {

	public static void main(String[] args) {
		
		//Constant declaration
		int ELEMENTS_ARRAY=10;
		
		//Variable declaration
		int number=0;
		
		//Array declaration
		int[] insertionArray = new int[ELEMENTS_ARRAY];
		
		//Object declaration
		Random randomnumbers = new Random(System.nanoTime());
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			insertionArray[i] = randomnumbers.nextInt(ELEMENTS_ARRAY);
			System.out.print(insertionArray[i]);
		}
		
		

	}

}
