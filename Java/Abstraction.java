public class Abstraction {
	public static void main(String[] args) {
		ATM atm = new SBIATM(200000);
		atm.insertCard();
		atm.enterPin();
		atm.withdrawMoney();
	}
}

abstract class ATM {
	int totalCash;

	ATM(int totalCash) {
		this.totalCash = totalCash;
	}

	abstract void withdrawMoney();

	abstract void insertCard();

	abstract void enterPin();

	void changePin() {
		System.out.println("PIN Changed");
	}
}

class SBIATM extends ATM {
	SBIATM(int totalCash) {
		super(totalCash);
	}

	@Override
	void withdrawMoney() {
		System.out.println("Money withdrawn successfully");
	}

	@Override
	void insertCard() {
		System.out.println("Card Inserted");
	}

	@Override
	void enterPin() {
		System.out.println("PIN Verified");
	}
}