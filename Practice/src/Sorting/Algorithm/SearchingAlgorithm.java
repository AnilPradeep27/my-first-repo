package Sorting.Algorithm;

public class SearchingAlgorithm {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		int target = 5;
		System.out.println(findElementByLinearSearch(arr, target));
		
		System.out.println(findElementByBinarySearch(arr, target));

	}

	private static int findElementByBinarySearch(int[] arr, int target) {
		int low =0;
		int high = arr.length-1;

		while(low<=high) {

			int mid = (low +high)/2;

			if(arr[mid]==target) {
				return mid;

			}else if(arr[mid]<target) {
				low=  mid +1;

			}else {
				high = mid -1;
			}
		}
		return -1;


	}

	private static int findElementByLinearSearch(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]== target) {
				return i;
			}
		}
		
		return -1;
		
	}

}
