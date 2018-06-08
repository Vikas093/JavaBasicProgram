package codingJava;

import java.util.Scanner;

public class PalindromAndReverseOfNoWithFunction {
	static int n,r;
	static int sum=0;
	public static int ReverseOfNumber(int n)
	{
		System.out.println("Number before reverse is"  + "...." +n);
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum*10+r;
			}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");  
		n=in.nextInt();
		System.out.println("The number Entered is " + "...."  +  n   );
		int sum1=ReverseOfNumber(n);
		if(sum1==n)
		{
			System.out.println("Number is Palindrome");
			System.out.println("Reverse of the number is"   +   "..."   + sum1 );
		}
		else
		{
			System.out.println("Number is not Palindrme ");
			System.out.println("Reverse of the number is"   +   "..."   + sum1 );
		}
		

	}
}


