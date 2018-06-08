package codingJava;

public class SwappingNoWithTemp {
	
	public static void main(String[] args) {
		/*int a=5;
		int b=4;
		int temp;
		System.out.println("The value of a before swapping is "  + "...."  +a);
		System.out.println("The value of b before wapping is "  + "...."  +b);
		temp=a;
		a=b;//a=4
		b=temp;;//b=4
		System.out.println("The value of a after swapping is "  + "...."  +a);
		System.out.println("The value of b after swapping  is "  + "...."  +b);
		
*/
		/*// Technique second using formula
				int a=5;
				int b=4;
				System.out.println("The value of a before swapping is "  + "...."  +a);
				System.out.println("The value of b before wapping is "  + "...."  +b);
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println("The value of a after swapping is "  + "...."  +a);
				System.out.println("The value of b after swapping  is "  + "...."  +b);
				*/
		// Technique second using formula and xor operator
				int a=5;
				int b=4;
				System.out.println("The value of a before swapping is "  + "...."  +a);
				System.out.println("The value of b before wapping is "  + "...."  +b);
				a=a^b;
				b=a^b;
				a=a^b;
				System.out.println("The value of a after swapping is "  + "...."  +a);
				System.out.println("The value of b after swapping  is "  + "...."  +b);
				

		
	}
	}

