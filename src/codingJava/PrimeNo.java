package codingJava;

import java.util.Scanner;

public class PrimeNo {
	
	public static void PrimeNumber(int n)
	{
		boolean isprime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime){
		System.out.println(n +" is a prime numbere");
		}
		else
			System.out.println(n  +"\t"+"is not  prime number");
	}

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no to check it is prime or not");
		n=in.nextInt();
		PrimeNumber(n);
		

	}

}
