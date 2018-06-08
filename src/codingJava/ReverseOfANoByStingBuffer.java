package codingJava;

import java.nio.Buffer;
import java.util.Scanner;

public class ReverseOfANoByStingBuffer 
{
	static int n,r;
	
	public static void main(String[] args) 
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number");  
	n=in.nextInt();
	System.out.println("The number Entered is " + "...."  +  n   );
	ReverseOfNumber(n);

}
	public static void ReverseOfNumber(int n) 
	{
		
		String reverseNo=new String(new StringBuffer(String.valueOf(n)).reverse());
		System.out.println(reverseNo);
	}
}