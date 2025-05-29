package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*we are hosing a party, every guest entered into the party they need to collect the passes from the counter and 
then they will enter into the party, these passes are reusable , 
we can reissue passes to the other guests who will enter into the party, 
when guest left the party they need to submit the passes to the counter back and 
theses passes are reuseable , we need to write a logic for total number of passes used 
and total number of guest attended the party*/


public class Test {
   public static void main(String[] args) {
	   
	   String s = " i love my country india jai hind ";
	   
	  /* String str = s.replaceAll("\\s+", "").toLowerCase();
	   
       Map<Character, Long> freq = str.chars().mapToObj(c -> (char)c).collect(Collectors.
			                        groupingBy(Function.identity(),Collectors.counting()));
       
	   List<Map.Entry<Character, Long>> list = new ArrayList<>(freq.entrySet());
	   
	   Collections.sort(list,new Comparator<Map.Entry<Character, Long>>() {

		@Override
		public int compare(Entry<Character, Long> o1, Entry<Character, Long> o2) {
			// TODO Auto-generated method stub
			return o2.getValue().compareTo(o1.getValue());
		}
		   
	});
	   System.out.println(freq);*/
	   
	   
	   frequencyChar(s);
	   
   }
   
   
   public static void frequencyChar(String s) {
	   
	  String str = s.replaceAll("\\s+", "").toLowerCase();
	  char[] ch = str.toCharArray();
	  
	  HashMap<Character, Integer> map = new HashMap();
	  
	  for(char res : ch) {
		  map.put(res,map.getOrDefault(res, 0)+  1);
	  }
	  
	  System.out.println(map);
	  List<Map.Entry<Character, Integer>> list = new ArrayList(map.entrySet());
	  
	
	  
	  Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

		  @Override
		  public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
			  // TODO Auto-generated method stub
			  return o2.getValue().compareTo(o1.getValue());
		  }
});
	  System.out.println(list);
   }
   }



