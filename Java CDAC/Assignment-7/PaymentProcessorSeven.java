interface PaymentSeven {
	void pay();
}

class CreditCardPaymentSeven implements PaymentSeven {
	public void pay() {
		System.out.println("Payment made using Credit Card");
	}
}

class PaypalPaymentSeven implements PaymentSeven {
	public void pay() {
		System.out.println("Payment made using Paypal");
	}
}

class PaymentProcessorSeven {
	void processPayment(PaymentSeven payment) {
		payment.pay();
	}

	public static void main(String[] args) {
		PaymentSeven creditCard = new CreditCardPaymentSeven();
		PaymentSeven paypal = new PaypalPaymentSeven();

		PaymentProcessorSeven processor = new PaymentProcessorSeven();

		processor.processPayment(creditCard);
		processor.processPayment(paypal);
	}
}