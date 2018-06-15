package codingJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateValueInAnArray {
	static int n;
	static String array[];
	static int c;

	public static void duplicateValueInArray(String[] array) 
	{
		// First method to find duplicate but the complexity of this method is O(n*n)
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i].equals(array[j]))

						{
					System.out.println("Duplicate value in array is"+ "------>"  + array[i]);
						}
			}
		}


		// Second method to find duplicate but the complexity of this method is O(n)

		Set<String> stringValue=new HashSet<>();
		for(int i=0;i<array.length;i++)
		{
			if(stringValue.add(array[i])==false)
			{
				System.out.println("Duplicate value in array is"+ "------>"  + array[i]);
			}
		}
		
		// Third method to find duplicate but the complexity of this method is O(2n)
		
		Map<String,Integer> storeMap=new HashMap<>();
		for(String array2:array)
		{
			Integer count=storeMap.get(array2);
			if(count==null)
			{
				storeMap.put(array2, 1);
			}
			else
			{
				storeMap.put(array2, ++count);
			}
		}
		
		// for(Map.Entry<Integer, Book> entry:map.entrySet()){   
		
		for(Map.Entry<String, Integer> entrySet:storeMap.entrySet())
		{
			if(entrySet.getValue()>1)
			{
				System.out.println("Duplicate value in array is"+ "------>"  + entrySet.getKey());
			}
		}
	}

	public static void main(String[] args)
	{

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the  no ");
		n=in.nextInt();
		array=new String[n];
		System.out.println("Enter " +  n  + "\t" +     "String");
		for(c=0;c<n;c++)
		{
			array[c]=in.next();
		}
		duplicateValueInArray(array);

	}



}
