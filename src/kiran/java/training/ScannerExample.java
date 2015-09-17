package kiran.java.training;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Continue?[Y/N]");
		while (sc.hasNext() && (sc.nextLine().equalsIgnoreCase("y"))) {//change here
		    System.out.println("Enter first name");
		    String name = sc.nextLine();
		    System.out.println(name);
		    System.out.println("Enter surname");
		    String surname = sc.nextLine();
		    System.out.println(surname);
		    System.out.println("Enter number");
		    int number = 0;
		    try {
		        number = Integer.parseInt(sc.nextLine());
		        System.out.println(number);
		    } catch (IllegalArgumentException e) {
		        e.printStackTrace();
		    }
		    System.out.println("Continue?[Y/N]");
		}
		sc.close();
	}
}
