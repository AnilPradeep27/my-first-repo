
public class zerostoFront {
	public static void main(String[] args) {
		int[] numbers = {5, 3, 0, 8, 0, 4, 2};

		System.out.println("Before sorting:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}

		//moveZerosToFront(numbers);

		moveZerosToEnd(numbers);
		System.out.println("\nMove Zeros to End:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}

	private static void moveZerosToFront(int[] numbers) {
		int n = numbers.length;
		int count =0;

		for (int i = 0; i < n; i++) {
			if (numbers[i] == 0) {
				count++;
			}
		}

		int index =count;

		for (int i = 0; i < n-index; i++) {
			if (numbers[i] != 0) {
				numbers[index++] = numbers[i];
			}
		}

		for (int i = 0; i < count; i++) {
			numbers[i] = 0;
		}
	}

	private static void moveZerosToEnd(int[] arr) {
		int n = arr.length;
		int index =0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[index++] = arr[i]; 
			}

		}

		while(index<n) {
			arr[index++] =0;			
		}

	}
}
