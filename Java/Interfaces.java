public class Interfaces {
	public static void main(String[] args) {
		Payment obj = new UpiPayment();
		obj.pay();
	}
}

interface Payment {
	final int id = 3487;

	void pay();

	default void printReceipt() {
		System.out.println("Receipt Generated");
	}
}

class UpiPayment implements Payment {
	@Override
	public void pay() {
		System.out.println("Payment made through UPI");
	}

}

class CreditCard implements Payment {
	@Override
	public void pay() {
		System.out.println("Payment made through Credit Card");
	}

}