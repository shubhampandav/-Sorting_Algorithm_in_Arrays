package Sorting_algo_in_Arrays;

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {

		// what's bubbles short?
		/**
		 * ans : bubble short is the simple short algorithm that works by Repeatedly
		 * swamping the adjacent element if they are in wrong order . this is element
		 * swap until they get given order.
		 */

		Scanner sc = new Scanner(System.in);
		int number[] = new int[5];  // declare an array of 5 size 
		int n = number.length;

		System.out.println("Enter the element in array : ");
		for (int i = 0; i < 5; i++) {

			number[i] = sc.nextInt(); // taking input in array 
		}

		for (int i = 0; i < n - 1; i++) {   

			for (int j = 0; j < n - 1; j++) {

				if (number[j] > number[j + 1]) { //  this is for checking is greater than other number 

					int temp = number[j];    // this is swapping of number 
					number[j] = number[j + 1];
					number[j + 1] = temp;

				}
			}

		}
		System.out.println("Element in assending order : ");   // this is printing the sorted array 
		for (int i = 0; i < number.length; i++) {

			System.out.println(number[i]);

		}
	}

}
