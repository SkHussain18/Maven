package org.string;

public class Reverse {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		String out = "";
		
		for (int i = s.length()-1; i>=0; i--) {
			char charAt = s.charAt(i);
			out = out+charAt;
		}
		System.out.println(out);
	}

}
