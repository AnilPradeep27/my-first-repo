import java.util.Arrays;

public class Test2 {

	//a = [3,4,9,10,14]
	//b = [6,8,25]
	//[3,4,6,8,9,10,14,25]
			 //{25,26,29}
	public static void main(String[] args) {
		
		int arr1[] = {3,4};
		int arr2[] = {6,8,25};
		int [] arr = mergeSorted(arr1,arr2);
		System.out.println(Arrays.toString(arr));
	}
	
	private static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;

		int [] merged = new int[n1 +n2];

		int i=0,j=0,k=0;
		while(i<n1&&j<n2) {
			if(arr1[i]<arr2[j]) {
				merged[k++] = arr1[i++];
			}else {
				merged[k++] = arr2[j++];
			}
		}
		while(i<n1) merged[k++] = arr1[i++];
		while(j<n2) merged[k++] = arr2[j++];

		return merged;
	}
	
	public static int[] mergeSorted(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

      /*  while(i < arr1.length) {
            merged[k++] = arr1[i++];
        }*/

        while(j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

}