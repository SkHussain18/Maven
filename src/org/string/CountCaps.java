package org.string;

public class CountCaps {
	
	public static void main(String[] args) {
		
		String s = "JavaScript@!123";
		String caps = "";
		String small = "";
		String no = "";
		String sc = "";
		int c = 0;
		int sm = 0;
		int n = 0;
		int special = 0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if (ch>='a'&&ch<='z') {
				small = small+ch;
				sm++;
			}
		}
		System.out.println(small);
		System.out.println(sm);
	}

}
