class Alphabet{
	public static void main(String[] args) {
		char c = args[0].charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
			System.out.println("The character is a Vowel.");
		}
		else{
			System.out.println("The character is a Consonant.");
		}
	}
}