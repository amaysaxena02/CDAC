	import java.util.*;
	class MinMaxArray{
		public static void main(String[] args) {
			int[] arr = new int[10];
			for(int i=0; i<arr.length; i++){
				arr[i] = 1 + (int)(Math.random()*20);
			}

			int min = arr[0];
			int max = arr[0];
			System.out.println(Arrays.toString(arr));

			for(int i : arr){

				if(i>max)max =i;
				if(i<min)min = i;
			}

			System.out.println("Max element: " + max);
			System.out.println("Min element: " + min);

		}
	}