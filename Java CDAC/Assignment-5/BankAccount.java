class BankAccount {
	int accno;
	String accType;
	double balance;

	static double interestRate;

	static {
		interestRate = 5.0;
	}

	BankAccount(int accno, String accType, double balance) {
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

	void display() {
		System.out.println("Account No: " + accno);
		System.out.println("Account Type: " + accType);
		System.out.println("Balance: " + balance);
		System.out.println("Interest Rate: " + interestRate + "%");
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(101, "Savings", 10000);
		BankAccount b2 = new BankAccount(102, "Current", 20000);

		b1.deposit(5000);
		b2.withdraw(3000);

		b1.display();
		System.out.println();

		b2.display();
	}
}