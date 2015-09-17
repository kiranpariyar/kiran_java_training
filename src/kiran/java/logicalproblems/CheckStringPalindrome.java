package kiran.java.logicalproblems;

import java.util.Scanner;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter any String :");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		
		String reverse = new StringBuilder(word).reverse().toString();
		
		if(word.equals(reverse)){
			System.out.println("string is palindrome");
		}else{
			System.out.println("string is not palindrome");
		}
		scanner.close();
	}
}
