package dsa;

import java.util.Arrays;

public class WaveForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,10,8,6,4,2};
		System.out.println(Arrays.toString(arr));
		//sort the array 
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i=i+2)
		swap(arr,i,i+1);
		System.out.println(Arrays.toString(arr));
	}
	static void swap (int arr[],int i,int j){
		
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
		
	}
	
}
