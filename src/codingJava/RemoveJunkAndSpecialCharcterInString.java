package codingJava;

public class RemoveJunkAndSpecialCharcterInString {

	public static void main(String[] args) {
	String s=new String("$&*(((&^$$ VIKAS PALIWAL &&&((&((&(&");
	System.out.println(s);
	s=s.replaceAll("[^a-z0-9A-Z]", "");
	System.out.println(s);

	}

}
