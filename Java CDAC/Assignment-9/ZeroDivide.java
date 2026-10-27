import java.util.*;
class ZeroDivide{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers to divide: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		try{
			int result = a/b;
			System.out.println("Result: "+result);
		}		
		catch(ArithmeticException e){
			System.out.println("Can't divide by zero");
		}
		finally{
			System.out.println("Operation Complete");
		}
	}
}