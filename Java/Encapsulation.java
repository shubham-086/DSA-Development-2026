public class Encapsulation {
	public static void main(String[] args) {
		Bank obj = new Bank("Amit", 101, 50000);
		System.out.println(obj);
	}
}

class Bank {
	private String holderName;
	private int accNO;
	private int balance;

	Bank(String holderName, int accNO, int balance) {
		this.holderName = holderName;
		this.accNO = accNO;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccNO() {
		return accNO;
	}

	public String getHolderName() {
		return holderName;
	}

	@Override
	public String toString() {
		return "Holder's Name: " + holderName + ", Acc. No: " + accNO + ", Balance " + balance;
	}
}