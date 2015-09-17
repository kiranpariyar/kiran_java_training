package kiran.java.training;

public class Testing {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		Integer x = new Integer(5);
		int y = 5;
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
		System.out.println(x == y);
		
	}
}
