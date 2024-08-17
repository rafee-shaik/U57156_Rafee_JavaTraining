package Examples;

public class Example11 {

	public static void main(String[] args) {
		// Implementing 2D array Diagonal Sum Calculation
		
		int[][] dataset = {{1,2,3,4},{4,5,6,7},{2,3,4,5},{8,4,5,6}};
		
		System.out.println("Diagonal sum is " + getDiagonalSum(dataset));
		
		System.out.println("Total arrayl sum is " + gettotalDiagonalSum(dataset));
		
		System.out.println("Reverse Diagonal sum is " + getrDiagonalSum(dataset));

	}
	
	 static int getDiagonalSum(int[][] matrix) {  
	        int n = matrix.length;  
	        int diagonalSum = 0;  
	        for (int i = 0; i < n; i++) {  
	            diagonalSum += matrix[i][i];  
	        }  
	        return diagonalSum;  
	    }
	 static int gettotalDiagonalSum(int[][] matrix) {  
	        int n = matrix.length;  
	        int diagonalSum = 0;  
	        for (int i = 0; i < n; i++) {
	        	for (int j = n-1; j>=0; j--)
	            diagonalSum += matrix[i][j];  
	        }  
	        return diagonalSum;  
	    }
	 static int getrDiagonalSum(int[][] matrix) {  
	        int n = matrix.length;  
	        int diagonalSum = 0;  
	        for (int i = 0, j = n-1; i < n && j >= 0; i++, j--) {  
	            diagonalSum += matrix[i][j];  
	        }  
	        return diagonalSum;  
	    }

}
