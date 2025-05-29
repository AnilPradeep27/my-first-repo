import java.util.Arrays;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		String str1 = "Listen";
		String str2 = "Silent";
		/*if(isAnagram(str1,str2)) {
			System.out.println("Given Strings are Anagrams");
		}else {
			System.out.println("Given Strings are not Anagrams");
		}*/
		
		int [] arr = {1,2,3,4,5};
		int target = 7;
		
		int res [] = findSumTarget(arr,target);
		
		for(int num : res) {
			
			System.out.println(num);
		}
			
		

	}

	private static int[] findSumTarget(int[] arr, int target) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			int temp = target - arr[i];
			
			if(map.containsKey(temp)) {
				
				return new int[] {map.get(temp),i};
				
			}
			map.put(arr[i], i);
					
					
		}
		return null;
		
		
	}

	private static boolean isAnagram(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		if(str1.length()!=str2.length()) {
			
			return false;
			
		}
		
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		Arrays.sort(charArr1);
		
		Arrays.sort(charArr2);
		
		return Arrays.equals(charArr1, charArr2);
		
	}
	
	

	
	
}
