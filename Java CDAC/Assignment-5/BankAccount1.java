class BankAccount1 {
	int accno;
	String accType;
	double balance;

	static double interestRate;

	static {
		interestRate = 5.0;
	}

	BankAccount1(int accno, String accType, double balance) {
		this.accno = accno;
		this.accType = accType;
		this.balance = balance;
	}

	void deposit(double amount) {
		balance = balance + amount;
	}

	void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}

	static double calculateInterest(double balance, double rate) {
		return (balance * rate) / 100;
	}

	void display() {
		double interest = calculateInterest(balance, interestRate);

		System.out.println("Account No: " + accno);
		System.out.println("Account Type: " + accType);
		System.out.println("Balance: " + balance);
		System.out.println("Interest Earned: " + interest);
	}

	public static void main(String[] args) {
		BankAccount1 b1 = new BankAccount1(101, "Savings", 10000);
		BankAccount1 b2 = new BankAccount1(102, "Current", 20000);

		b1.deposit(5000);
		b2.withdraw(3000);

		b1.display();
		System.out.println();

		b2.display();
	}
}