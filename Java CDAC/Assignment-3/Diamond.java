class Diamond{
	public static void main(String[] args) {
		int rows = Integer.parseInt(args[0]);

		for(int i = 1; i <= rows; i++){
			for(int sp = 1; sp <= rows-i; sp++){
				System.out.print(" ");
			}

			for(int j = 1; j <= 2*i-1; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		for(int i = rows-1; i >= 1; i--){
			for(int sp = 1; sp <= rows-i; sp++){
				System.out.print(" ");
			}

			for(int j = 1; j <= 2*i-1; j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}