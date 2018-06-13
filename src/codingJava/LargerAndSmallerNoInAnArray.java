package codingJava;

import java.util.Scanner;

public class LargerAndSmallerNoInAnArray {
	static int n,m;
	static int array[];
	static int c;
	static int temp;
	static int largerNo;

	public static void largerAndSmallerNo(int[] array)
	{
		int largerNo=array[0];
		int smallerNo=array[0];
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>largerNo)
			{
				largerNo=array[i];//8
			}
			
			else if(array[i]<smallerNo)
			{
				smallerNo=array[i];//2
			}
		}
		
		System.out.println("larger no is " + "------>" + largerNo);
		System.out.println("Smaller no is " + "------>" +smallerNo);
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

		largerAndSmallerNo(array);


	}


}
