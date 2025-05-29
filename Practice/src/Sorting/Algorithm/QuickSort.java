package Sorting.Algorithm;

import java.util.Arrays;

/*
 * Quick Sort is a divide-and-conquer sorting algorithm

1.Select a pivot element.

2.Partition the array such that:

All elements less than pivot are on the left.

All elements greater than pivot are on the right.

3.Recursively sort the subarrays on each side of the pivot.

 */

public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// Partition the array
			int pivotIndex = partition(arr, low, high);

			// Recursively sort the left and right sub-arrays
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];  // Choose the last element as pivot
		int i = low - 1;         // Index of smaller element

		for (int j = low; j < high; j++) {
			// If current element is less than or equal to pivot
			if (arr[j] <= pivot) {
				i++;
				// Swap arr[i] and arr[j]
				swap(arr, i, j);
			}
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}

		// Swap arr[i+1] and pivot (arr[high])
		swap(arr, i + 1, high);
		return i + 1;  // Return pivot index
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// For testing
	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		quickSort(arr, 0, arr.length - 1);

		System.out.println("Sorted array:");
		for (int num : arr) {
			//System.out.print(num + " ");
		}
	}
}
