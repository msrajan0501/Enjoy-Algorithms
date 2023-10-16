package dsa;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {34,78,56,7,97};
//int min = arr[0];
int max = arr[0];
for (int i =0;i<arr.length;i++) {
	if (arr[i]> max)
		max= arr[i];
	
}
System.out.println(max);
	}

}
