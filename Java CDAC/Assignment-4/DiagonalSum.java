import java.util.*;
class DiagonalSum{
	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		System.out.println("Array : ");
		for (int i = 0; i<3; i++ ) {
			for (int j = 0; j<3 ; j++ ) {
				arr[i][j] = 10 + (int)(Math.random()*30); 
				System.out.print(arr[i][j] + "    ");
			}
			System.out.println();
		}

		int sum = 0;
		for (int i = 0; i<3; i++ ) {
			for (int j = i; j<=i ; j++ ) {
				sum += arr[i][j];
			}
		}

		System.out.println("Sum of diagonal elements: " + sum);
	}
}
