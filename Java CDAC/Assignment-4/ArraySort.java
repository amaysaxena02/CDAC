import java.util.*;
class ArraySort{
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++){
			arr[i] = 1 + (int)(Math.random()*20);
		}
 		
 		System.out.println("Original array: "+Arrays.toString(arr));

 		for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: "+Arrays.toString(arr));

	}
}