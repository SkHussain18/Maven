package org.string;

public class ReverseNum {
	
	public static void main (String[]args) {
		 
		int a = 153;
		int rev = 0;
		int temp = a;
		
		while (a>0) {
			
			int b = a%10;
			rev = rev+(b*b*b);
			a=a/10;
		}
		System.out.println(rev);
		if (temp==rev) {
			System.out.println("armstrong");
		}else {
			System.out.println("not a armstrong");
		}
	}

}
