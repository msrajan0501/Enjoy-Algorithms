package dsa;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 97, 78, 67, 98, 10 };
		System.out.println(Arrays.toString(a));
		bubblsort(a);
		System.out.println(Arrays.toString(a));

	}

	static void bubblsort(int arr[])

	{
		// running loop for the length of the array
		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			// running loop to pick and compare contiguous 2 elements in the array
			// j condition is set like tat (arr.length-i-1) as by end of first pass one
			// element will be sorted
			for (int j = 0; j < arr.length - i - 1; j++) {
				// if the next element in array is greater , perform swap
				if (arr[j] < arr[j + 1]);
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;

				}
			}
			if (!swapped)
				break;
		}

	}
}
