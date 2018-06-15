package codingJava;

import java.util.Scanner;

/**
 * @author Vikas
 *
 */
public class FibonacciSeries {
	static int n3=0;
	static int n2=1;
	static int n1=0;
	static int n;
	
	static void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }    
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");  
		n=in.nextInt();
		System.out.print(n1+" "+n2);//printing 0 and 1    
		printFibonacci(n-2);
		

	}



	

}
