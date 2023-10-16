package dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//run the loop for the entire length of the array 
		//consider the first element in array to be smallest 
		//Iterate thru the array and find the smallest nbr and move to the first position 
		//Increment the pointer 
				
		int arr[] = {7888,9714,5767,5191,3699,0};
		System.out.println(Arrays.toString(arr));
		for (int i =0;i<arr.length;i++)
		{
			//int minVal= arr[i];
			int minIndex = i;
			for (int j = i;j<arr.length;j++)
			{
				//if (arr[j]<arr[minIndex])
				if ( arr[j]< arr[minIndex])
				{
					//minVal = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i]= arr[minIndex];
			arr[minIndex]=temp;
			System.out.println(Arrays.toString(arr));	
		}
		
	}

}
