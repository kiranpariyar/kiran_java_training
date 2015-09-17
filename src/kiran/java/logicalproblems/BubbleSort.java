package kiran.java.logicalproblems;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = {1,2,14,3,123,9,51,6};
		int temp, sizeOfArray = numbers.length;
		
		for(int i = 0; i < sizeOfArray-1 ;i++){
			for(int j = 0; j < sizeOfArray -1; j++){				
				if(numbers[j]>numbers[j+1]){
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		for(int x : numbers){
			System.out.println(x);
		}
	}
}
