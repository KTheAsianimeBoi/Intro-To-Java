package Week12;

public class Ex121_1W21CF19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_Account acc = new Bank_Account("Khoa",12141518,100000);
		acc.withdraw(50000);
		acc.deposit(20000);
		acc.confirmation();
	}

}
