package codingJava;


import java.util.Scanner;

public class LinearSeachWithFunction {
	public static int LinearSearch(int[] l,int key)
	{
		for(int i=0;i<l.length;i++)
		{
			if(l[i]==key){
				return i;				
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int c,n,search,array[];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=in.nextInt();
		array=new int[n];
		System.out.println("Enter " +  n  + "\t" +     "integers");
		for(c=0;c<n;c++)
		{
		array[c]=in.nextInt();
		}
		
		System.out.println("Enter value to find");
		search=in.nextInt();
		int index=LinearSearch(array,search);
		if(index== -1)
		{
			System.out.println(search+  "not found");
					}
		else{
			System.out.println(search  +"/t"+  "is found at postion" + index   );
		}
		
		

	}

}
