package codingJava;

import java.util.Scanner;

public class NoOfCharcter {
	static int count=0;
	public static int letterCount(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		System.out.println(count);
		return (count -s.split(" ").length)+1;
	}

	public static void main(String[] args) {
		String n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		n=in.nextLine();
		int count=letterCount(n);
		System.out.println(count);

	}

}
