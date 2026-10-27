class PascalTriangle{
	public static void main(String[] args) {
		int rows = Integer.parseInt(args[0]);

		for(int i = 0; i < rows; i++){

			for(int sp = 0; sp < rows-i-1; sp++){
				System.out.print(" ");
			}

			int coeff = 1;

			for(int j = 0; j <= i; j++){
				System.out.print(coeff + " ");
				coeff = coeff * (i-j) / (j+1);
			}

			System.out.println();
		}
	}
}