import java.util.*;
class ReverseArray{
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i=0;i<arr.length;i++ ) {
			arr[i] = 1 + (int)(Math.random()*20);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Reverse Array: ");
		int [] rev = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			rev[i] = arr[arr.length - 1 -i ];
		}
		System.out.println(Arrays.toString(rev));
	}
}