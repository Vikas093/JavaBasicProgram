package codingJava;

import java.util.Scanner;

public class ReverseWordInString {
	public static void ReverseString(String str){
		System.out.println(str.length());
		String[] a=str.split(" ");
		System.out.println("");
		int len=a.length;
		System.out.println("Length of string to be reverse is" + "\t"+len);
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(a[i] +  "  ");
		}
	}
	public static void main(String[] args) {
		String n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		n=in.nextLine();
		ReverseString(n);
	}

}





