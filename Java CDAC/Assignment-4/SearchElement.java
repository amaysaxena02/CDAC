import java.util.*;
class SearchElement{
	public static void main(String[] args) {
			int[] arr = new int[100];
			for(int i = 0; i<arr.length; i++){
				arr[i] = 1 + (int)(Math.random()*100);
			}
			System.out.println(Arrays.toString(arr));
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an element to search: ");
			int key = new Scanner(System.in).nextInt();
			boolean flag = false;
			for (int i = 0 ;i<arr.length;i++ ) {
				if(key==arr[i]){
					System.out.println(key + " is present in the array at index " + i);
					flag = true;
				}
			}

			if (flag!=true){
				System.out.println(key + " is not present in the array.");
			}	
		}	
}