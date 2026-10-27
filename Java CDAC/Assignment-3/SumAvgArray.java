class SumAvgArray{
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = {10, 20, 30, 40, 50};
		for(int i = 0 ; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		for(int i = 0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		int avg = sum/arr.length;
		System.out.println("Sum: " + sum + ", " + " Average: " + avg);
	}
}