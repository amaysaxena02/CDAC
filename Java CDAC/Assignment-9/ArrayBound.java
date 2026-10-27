import java.util.*;
class ArrayBound{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
 		
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter nth element to be accessed: ");
 		int n = sc.nextInt();

		try{
			System.out.println("Your element: "+arr[n]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds!");
		}
		finally{
			System.out.println("Operation is complete.");
		}
	}
}