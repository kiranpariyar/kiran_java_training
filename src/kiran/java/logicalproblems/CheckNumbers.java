package kiran.java.logicalproblems;

public class CheckNumbers {

	public void checkPowerOfTwo(int x) {
		int temp = 0;

		for (int i = 1; x > temp; i++) {
			temp = (int) Math.pow(2, i);
		}

		if (x == temp) {
			System.out.println("number is power of two");
		} else {
			System.out.println("number is not power of two");
		}

	}

	public void checkPalindrome(int x) {
		int digitNumber = 0;
		while(x/10 == 0){
			digitNumber++;
		}
		
		System.out.println(digitNumber);
		
	}

	public static void main(String[] args) {
		
	}

}
