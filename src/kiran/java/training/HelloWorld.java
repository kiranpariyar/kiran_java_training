package kiran.java.training;

public class HelloWorld {

	public static void main(String[] args) {
	
		StaticFieldDemo O1 = new StaticFieldDemo(5);
		System.out.println(O1.getStaticField());
		
		StaticFieldDemo O2 = new StaticFieldDemo();
		System.out.println(O2.getStaticField());
		
		StaticFieldDemo O3 = new StaticFieldDemo(6);
		System.out.println(O3.getStaticField());
		System.out.println(O1.getStaticField());
		System.out.println(O2.getStaticField());
		
	}

}
