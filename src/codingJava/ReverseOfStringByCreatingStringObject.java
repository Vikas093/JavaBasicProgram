package codingJava;

import java.util.Scanner;

public class ReverseOfStringByCreatingStringObject {
	

	public static void main(String[] args) {
		// using our own logic
		//for this we require 2 string object
		String Orginal;
		int i;
		String rev="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String to Reverse");
		Orginal=in.next();
		int len=Orginal.length();
		System.out.println(len);
		for(i=len-1;i>=0;i--)
		{
			rev=rev+Orginal.charAt(i);
		}
		System.out.println("Original string is :   "+Orginal);
		System.out.println("Reverse of the string is  : " +rev);	
		
	}

}
