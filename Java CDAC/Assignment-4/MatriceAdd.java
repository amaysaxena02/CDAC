import java.util.*;
class MatriceAdd{
	public static void main(String[] args) {
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];

		System.out.println("Array 1: ");
		for (int i = 0; i<3; i++ ) {
			for (int j = 0; j<3 ; j++ ) {
				arr1[i][j] = 1 + (int)(Math.random()*20); 
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Array 2: ");
		for (int i = 0; i<3; i++ ) {
			for (int j = 0; j<3 ; j++ ) {
				arr2[i][j] = 1 + (int)(Math.random()*20);
				System.out.print(arr2[i][j] + " "); 
			}
			System.out.println();
		}

		int[][] sum = new int[3][3];

		System.out.println("Sum of Array 1 and Array 2: ");
		for (int i = 0; i<3; i++ ) {
			for (int j = 0; j<3 ; j++ ) {
				 sum[i][j] = arr1[i][j] + arr2[i][j];
				 System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}


	} 
}