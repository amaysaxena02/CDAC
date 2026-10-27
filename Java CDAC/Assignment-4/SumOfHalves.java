import java.util.*;
class SumOfHalves{
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++){
			arr[i] = 1 + (int)(Math.random()*20);
		}
		System.out.println("Array: "+Arrays.toString(arr));

		int sum1 = 0;
		int sum2 = 0;

		for(int i = 0; i<arr.length/2; i++){
			sum1 = sum1 + arr[i];
		}
		for(int i = arr.length/2; i<arr.length; i++){
			sum2 = sum2 + arr[i];
		}
		System.out.println("Sum of first half: "+sum1);
		System.out.println("Sum of seconf half: "+sum2);

	}
}