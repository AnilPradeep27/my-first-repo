package Sorting.Algorithm;

public class SelectionSort {
	public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.println("Before sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        selectionSort(numbers);

        System.out.println("\nAfter sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

	private static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			
			for(int j=i+1;j<n;j++) {
				if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		
	}
	
}
