class OddFiftySum{
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 50 ; i+=2  ) {
			sum = sum + i;	
		}		
		System.out.println(sum + " is the sum of first fifty odd nubers");
	}	
}