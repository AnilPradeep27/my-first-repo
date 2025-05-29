package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class ReadValues {
	
	public static void main(String [] args) {
		String filePath = "file.txt";
		String str = "I like Java. I also like Python";
		//o/p : Java. also Pyth
		//removeRepeatedWords(str);
		removeRepeatedWords2(str);
		/*try(FileWriter writer = new FileWriter(filePath)){
			writer.write("Writing the values");
			System.out.println("Data written to File");
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}

		try(FileReader reader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(reader)) {
				String line;
				while(((line = bufferedReader.readLine())!=null)) {
					System.out.println("Read from Line"+line);
				}
			
		}catch(IOException ex) {
			ex.printStackTrace();
			
		}*/
	}
	
	public static String removeDuplicates(String str) {
		String result = Arrays.stream(str.split(" ")).distinct().collect(Collectors.joining(" "));
		
		System.out.println("Result: "+result);
		
		return result;
		
	}
	
	public static String removeRepeatedWords(String str) {
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		String [] words = new String[length];
		int [] wordCount = new int [length]; 
		int wordIndex =0;
		StringBuilder word = new StringBuilder();
		for(int i=0;i<length;i++) {
			if(charArray[i]!=' ') {
				word.append(charArray[i]);
				
			}else {
				if(word.length()>0) {
					words[wordIndex] = word.toString();
					wordCount[wordIndex] =1;
					wordIndex++;
					word.setLength(0);
				}
			}
		}
		
		if(word.length()>0) {
			words[wordIndex] = word.toString();
			wordCount[wordIndex] =1;
			
			wordIndex++;
		}
		
		for(int i=0;i<wordIndex;i++) {
			
			if(wordCount[i] ==0) {
				continue;
			}
			
			for(int j=i+1;j<wordIndex;j++) {
				
				if(words[i].equals(words[j])) {
					wordCount[i]++;
					wordCount[j] =0;
					
				}
			}
		}
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<wordIndex;i++) {
			
			if(wordCount[i]==1) {
				if(result.length()>0) {
					result.append(" ");
				}
				result.append(words[i]);
				
			}
		}
		System.out.println(result.toString());
		
		return result.toString();
		
	}
	
	public static void removeRepeatedWords2(String str) {
		String [] words = str.split(" ");
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();

		for(String word : words) {
			wordCountMap.put(word,wordCountMap.getOrDefault(word,0) + 1);
		}

		for(String word : words) {
			if(wordCountMap.get(word)==1) {
				System.out.print(word);
			}
		}
	}
	
	
	
}
