import java.util.*;
class SumOfOddIndex{
	public static void main(String[] args) {
		int[] arr = new int[20];
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			arr[i] = 1 + (int)(Math.random()*20);
		}
		System.out.println("Array: "+Arrays.toString(arr));
		for(int i = 1; i<arr.length; i = i+2){
			sum += arr[i]*arr[i];
		}
		System.out.println("Sum of square of odd indexed elements: "+sum);
	}
}