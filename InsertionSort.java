package dsa;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 78, 56, -9, 26, 23 };
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else
					break;
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
