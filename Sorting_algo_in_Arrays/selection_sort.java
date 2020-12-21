package Sorting_algo_in_Arrays;

class selection_sort {
	/**
	 * what's the selection sort??? 
	 * answer : Selection sort is a simple sorting
	 * algorithm. This sorting algorithm is an in-place comparison-based algorithm
	 * in which the list is divided into two parts, the sorted part at the left end
	 * and the unsorted part at the right end. Initially, the sorted part is empty
	 * and the unsorted part is the entire list.
	 * 
	 * The smallest element is selected from the unsorted array and swapped with the
	 * leftmost element, and that element becomes a part of the sorted array. This
	 * process continues moving unsorted array boundary by one element to the right.
	 * 
	 * This algorithm is not suitable for large data sets as its average and worst
	 * case complexities are of Ο(n2), where n is the number of items.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int number[] = { 12, 4, 5, 7, 78, 34, 98 };

		for (int i = 0; i < number.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < number.length; j++) {

				if (number[j] < number[min]) {
					min = j;

				}

			}
			// here we do swapping 
			if (min != i) {
				int temp = number[i];
				number[i] = number[min];
				number[min] = temp;

			}
		}
		// print  the element : 
		System.out.println("selected sort  : ");
		for (int i = 0; i < number.length; i++) {

			System.out.println(number[i]);

		}
	}
}