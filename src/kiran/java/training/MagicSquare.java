package kiran.java.training;

public class MagicSquare {

	public static void main(String[] args){
		
		int[] horizontalSum = new int[3];
		int[] verticalSum = new int[3];
		int[] diagonalSum = new int[2];
		
		int[][] magicSquare = new int[][]{
								{4,9,2},
								{3,5,7},
								{8,1,6}
							};					
		int sum1, sum2;
		//calculation of horizontal, vertical and diagonal sum
		for( int i =0; i < magicSquare.length; i++){
			
			sum1 = 0;
			sum2 = 0;
			
			for(int j=0; j < magicSquare[i].length; j++){
				sum1 += magicSquare[i][j];
				sum2 += magicSquare[j][i];
				
				if(i == j ){
					diagonalSum[0] += magicSquare[i][j]; 
				}
				
				if( i+j == 2){
					diagonalSum[1] += magicSquare[i][j];
				}
			}
			horizontalSum[i] = sum1;
			verticalSum[i] = sum2;
		}
		
		if( horizontalSum[0] == 15 && horizontalSum[1] == 15 && horizontalSum[2] == 15 && verticalSum[0] == 15 &&
				verticalSum[1] == 15 && horizontalSum[2] == 15 && diagonalSum[0] == 15 && diagonalSum[1] == 15 ){
			System.out.println("Magic Square");
		}else{
			System.out.println("Not Magic Square");
		}
	}
}
