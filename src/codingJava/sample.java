package codingJava;

public class sample {

	public static void main(String[] args) {
		try
		{
			System.out.println("this is try block");
			int x=10/0;
		}
		catch(NullPointerException e)
		{
			System.out.println("this is catch block");
		}
		finally
		{
			System.out.println("thsi is finally block always exceuted");
		}

	}

}
