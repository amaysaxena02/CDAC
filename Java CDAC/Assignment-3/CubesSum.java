class CubesSum{
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			sum = sum + ((int)(Math.pow(i,3)));
		}
		System.out.println("Sum of the cubes from 1 - 10: " + sum);
	}
}