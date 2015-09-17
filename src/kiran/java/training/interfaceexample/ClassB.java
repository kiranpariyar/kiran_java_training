package kiran.java.training.interfaceexample;

public class ClassB {
	public static void main(String[] args){
		InterfaceA classa = new ClassA();
		classa.printHelloWorld();
//		classa.printWelcome();   can not call method not present in interface
	}
}
