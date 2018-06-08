package codingJava;

public class RemoveJunkAndSpecialCharcterInString {

	public static void main(String[] args) {
	String s=new String("$&*(((&^$$ VIKAS PALIWAL &&&((&((&(&");
	s=s.replaceAll("[^a-z0-9A-Z]", "");
	System.out.println(s);

	}

}
