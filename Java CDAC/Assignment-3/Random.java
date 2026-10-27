import java.util.Scanner;
class Random{
	public static void main(String[] args) {
		
		int number = (int)(Math.random()*100 + 1);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Guess: ");
		int guess = sc.nextInt();

		if(guess < 0 || guess > 100)
			System.out.println("Enter a guess between 0-100!");

		while(guess!=number){
			if(guess<number){
				System.out.println("Your Guess is too low!");
			}
			else{
				System.out.println("Your Guess is too high!");
			}

			System.out.println("Enter another guess: ");
			guess = sc.nextInt();
		}

		System.out.println("Congrats! You've guessed the number " + number);
	}
}