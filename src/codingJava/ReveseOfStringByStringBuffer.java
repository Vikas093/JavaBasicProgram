package codingJava;

import java.util.Scanner;

public class ReveseOfStringByStringBuffer {
	

	public static void main(String[] args) {
		// using our own logic
		//for this we require 2 string object
		String Orginal;
		StringBuffer rev;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String to Reverse");
		Orginal=in.next();
		StringBuffer sb=new StringBuffer(Orginal);
		rev=sb.reverse();
		//rev=sb.reverse().toString();
		System.out.println("Original string is :   "+Orginal);
		System.out.println("Reverse of the string is  : " +rev);
		
		
	}

}
