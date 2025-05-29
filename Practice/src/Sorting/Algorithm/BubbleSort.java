package Sorting.Algorithm;

public class BubbleSort {
	public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.println("Before sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSort(numbers);

        System.out.println("\nAfter sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
	
}

	private static void bubbleSort(int[] numbers) {
		// TODO Auto-generated method stub
		int n = numbers.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(numbers[i]>numbers[j+1]) {
					int temp = numbers[i];
					numbers[i]= numbers[j+1];
					numbers[j+1] = temp;
				}

			}
		}
			
		}
	
		
	}
