package org.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Trail 
{
	public static void main(String[] args) {
		
		String s = "Hello";
		String small = "";
		int sm = 0; 
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
			{
				small = small+c;
				sm++;
			}
		}
		System.out.println(small);
		System.out.println(sm);
		
	}

}
