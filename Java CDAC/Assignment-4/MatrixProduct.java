import java.util.*;
class MatrixProduct{
	public static void main(String[] args) {
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];

		System.out.println("Array 1: ");
		for (int i = 0; i<3; i++ ) {
			for (int j = 0; j<3 ; j++ ) {
				arr1[i][j] = 10 + (int)(Math.random()*30); 
				System.out.print(arr1[i][j] + "    ");
			}
			System.out.println();
		}

		System.out.println("Array 2: ");
		for (int i = 0; i<3; i++ ) {
			for (int j = 0; j<3 ; j++ ) {
				arr2[i][j] = 10 + (int)(Math.random()*30);
				System.out.print(arr2[i][j] + "    "); 
			}
			System.out.println();
		}

		int[][] product = new int[3][3];

		for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Multiplication of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
	}
}