package kiran.java.training;

public class StaticFieldDemo {

	private static int staticfield;
	
	public StaticFieldDemo(){}
	
	public StaticFieldDemo(int x){
		staticfield = x;
	}
	
	public int getStaticField(){
		return StaticFieldDemo.staticfield;
	}
}
