package codingJava;

import java.util.Scanner;

public class MissingNoInAnArray 
{
	static int n,m;
	static int array[];
	static int c;
	static int expectedSum=0;
	static int actualSum=0;

	public static void missingNoInAnArray(int[] array,int m) 
	{
		expectedSum=(m*(m+1)/2);
		System.out.println(expectedSum);
		for(int i: array)
		{
			actualSum=actualSum+i;
		}
		System.out.println("Missing Number is" +"------>" + (expectedSum-actualSum));

	}

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the  no ");
		n=in.nextInt();
		array=new int[n];
		System.out.println("Enter " +  n  + "\t" +     "integers");
		for(c=0;c<n;c++)
		{
			array[c]=in.nextInt();
		}
		System.out.println("Enter the no one more than mentioned no ");
		m=in.nextInt();
		missingNoInAnArray(array,m);

	}



}
