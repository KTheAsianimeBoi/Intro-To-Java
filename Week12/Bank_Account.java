package Week12;

public class Bank_Account {
	String account_holder;
	long account_number;
	int deposit_amount;
	
	
	public Bank_Account(String account_holder,long account_number, int deposit_amount) {
		super();
		this.account_holder = account_holder;
		this.account_number = account_number;
		this.deposit_amount = deposit_amount;
	}

	public int withdraw(int amount) {
		this.deposit_amount-= amount;
		return this.deposit_amount;
	}
	
	public int deposit (int amount) {
		this.deposit_amount+= amount;
		return this.deposit_amount;
	}
	
	public void confirmation() {
		System.out.println("Account Holder: " + this.account_holder);
		System.out.println("Account Number: " + this.account_number);
		System.out.println("Deposit Amount: " + this.deposit_amount);		
		
	}
}
