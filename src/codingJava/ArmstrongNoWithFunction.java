package codingJava;

import java.util.Scanner;

public class ArmstrongNoWithFunction {


	static int n,r;
	static int sum=0;
	public static int ArmstrongNumber(int n)
	{

		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");  
		n=in.nextInt();
		System.out.println("The number Entered is " + "...."  +  n   );
		int sum1=ArmstrongNumber(n);
		if(sum1==n)
		{
			System.out.println("Number is Armstrong");

		}
		else
		{
			System.out.println("Number is not Armstrong ");

		}


	}

}
