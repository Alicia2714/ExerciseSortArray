package com.ExerciseSortArrays.add;

import java.util.Random;

public class BubbleArraySort {

	public static void main(String[] args) {
		
		//Constant declaration
		int ELEMENTS_ARRAY = 10;
		
		//Array declaration
		int[] bubbleArray = new int[ELEMENTS_ARRAY];
		
		//Object declaration
		Random randomnumbers = new Random (System.nanoTime());
		
		//Declaring random numbers  to the array
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			bubbleArray[i] = randomnumbers.nextInt(ELEMENTS_ARRAY);
			System.out.print(bubbleArray[i]);
		}
		
		//Bubble Sorting the array
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			
			for(int j=1; j<ELEMENTS_ARRAY; j++) {
				
			}
		}
	}

}
