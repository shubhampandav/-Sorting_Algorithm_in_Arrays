package Sorting_algo_in_Arrays;

import java.util.Scanner;

public class Bubble_short {

	public static void main(String[] args) {

 
		// what's bubbles short? 
		/**
		 * ans  : bubble short is the simple short algorithm that works by 
		 * Repeatedly swamping the adjacent element if they are in wrong 
		 *  order . this is element swap until they  get  given order.
		 */
		
Scanner sc = new Scanner(System.in);
int number[] = new int [5];
int n = number.length;

System.out.println("Enter the element in array : ");
for (int i = 0; i <5; i++) {
	
	number[i]= sc.nextInt();
}
		
		
		for (int i = 0; i <n-1; i++) {
			
			for (int j = 0; j <n-1; j++) {
				
				if (number[j]< number[j+1]) {
					
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					
				}
			}
			
		}
		System.out.println("Element in assending order : ");
		for (int i = 0; i < number.length; i++) {
			
			System.out.println(number[i]);
			
		}
	}

}
