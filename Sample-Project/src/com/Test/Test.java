package com.Test;

import java.util.*;

public class Test {
	
	/*
	 * 
	 * Input: 5 
 Output: 
 [ 
     [1], 
     [1,1], 
   [1,2,1], 
  [1,3,3,1], 
 [1,4,6,4,1] 
 ] 
	 * */
	/*Input: [1,3,4,2,2]
			Output: 2*/
	public static void main(String[] args) {
		int [] arr = {1,3,4,2,2};
		/*Map<Integer,Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num,map.getOrDefault(num,0)+1);
			
		}
		for(Map.Entry<Integer, Integer>entry:map.entrySet() ) {
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" ");
				
			}
			
		}*/
		
		Set<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			if(!set.add(num)) {
				System.out.println(num);
				
			}
			
		}
		
		
	
		
		

	}
	
	
	
	
	

}
