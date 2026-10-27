import java.util.*;
class LargeSmallN{
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++){
			arr[i]= 1 + (int)(Math.random()*20); 
		}
	Arrays.sort(arr);
	System.out.println("Array: "+Arrays.toString(arr));
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Eneter the Nth term largest/smallest element to be found: ");
	int n = sc.nextInt();

	if(n>arr.length || n<0){
		System.out.println("Invalid input");
		return;
	}

	System.out.println(n + " largest element is: " + arr[arr.length - n]);
	System.out.println(n + " smallest element is: " + arr[n-1]);
	}
	
}