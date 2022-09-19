package Week13;
public class Bank_Account{
    String account_holder;
    String account_number;
    int deposit_amount;

    /* Constructor */
    public Bank_Account(){
        account_holder = "No Name";
        account_number = "00000000";
        deposit_amount = 0;
    }

    /* Constructor */
    public Bank_Account(String ah, String an, int da){
        account_holder = ah;
        account_number = an;
        deposit_amount = da;
    }

    public int withdraw(int amount){
        deposit_amount = deposit_amount - amount;
        return deposit_amount;
    }

    public int deposit(int amount){
        deposit_amount = deposit_amount + amount;
        return deposit_amount;
    }
    
    public void confirmation(){
        System.out.println("Bank Holder:" + account_holder);
        System.out.println("Account Number:" + account_number);
        System.out.println("Deposit Amount:" + deposit_amount);
    }
}