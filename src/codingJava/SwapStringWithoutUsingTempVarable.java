package codingJava;

public class SwapStringWithoutUsingTempVarable {

	public static void main(String[] args) {
		
		
		
		String a="Vikas";
		String b="paliwal";
		System.out.println("The value of a before swapping is "  + "...."  +a);
		System.out.println("The value of b before wapping is "  + "...."  +b);
		a=a.concat(b);
		b=a.substring(0, 5);
		a=a.substring(5, 12);
		System.out.println("The value of a after swapping is "  + "...."  +a);
		System.out.println("The value of b  after swapping is "  + "...."  +b);
		
		

	}

}
