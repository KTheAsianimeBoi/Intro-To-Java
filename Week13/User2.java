package Week13;

public class User2 extends Bank_Account{
    int account_type;

    public User2(String string, String string2, int i, int type) {
        super(string, string2, i);
        account_type = type;
    }

    public void confirmation(){
        System.out.println("Bank Holder:" + account_holder);
        System.out.println("Account Number:" + account_number);
        System.out.println("Deposit Amount:" + deposit_amount);
        System.out.println("Account Type:" + account_type);
    }
    public static void main(String[] args) {
        User2 newUser = new User2("Your Name", "12345678", 1000000, 1);
        newUser.confirmation();
    }
}
