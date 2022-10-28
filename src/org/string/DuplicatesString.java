package org.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesString {
	
	public static void main (String[]args){
		
		String s = "Hussain";
		
		Map<Character,Integer>map = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);	
			Integer integer = map.get(c);
			if (map.containsKey(c)) 
			{
				map.put(c, integer+1);
			}else {
				map.put(c, 1);
			}
			}
		//System.out.println(map);
		char maxOccurChar = ' ';
		int minValue = 0;
		Set<Entry<Character,Integer>>entryset = map.entrySet();
		for(Entry<Character,Integer>entry:entryset) {
			Integer value = entry.getValue();
			if (minValue<=value) {
				maxOccurChar=entry.getKey();
				minValue = entry.getValue();
			}
		}
		System.out.println(minValue);
		System.out.println(maxOccurChar);
	}

}
