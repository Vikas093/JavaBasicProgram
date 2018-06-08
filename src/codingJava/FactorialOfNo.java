package codingJava;

import java.util.Scanner;

public class FactorialOfNo {

	private static int factorialOfno(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}


	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number whose Factorial we want");
		n=in.nextInt();
		int fact=factorialOfno(n);
		System.out.println("The Factorial of a number is"  +   "...." + '\t'  +  fact );
		
	}

}
